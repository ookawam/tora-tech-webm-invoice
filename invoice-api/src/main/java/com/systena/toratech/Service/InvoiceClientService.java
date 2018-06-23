package com.systena.toratech.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.systena.toratech.Dao.InvoiceClientDao;
import com.systena.toratech.Entity.InsertInvoiceEntity;
import com.systena.toratech.Entity.InvoiceErrorEntity;
import com.systena.toratech.Entity.InvoiceLastInsertEntity;
import com.systena.toratech.Response.ResponseInvoice;

@Service
@Transactional
public class InvoiceClientService {

    @Autowired
    InvoiceClientDao invoiceClientDao;

    public ResponseEntity<ResponseInvoice> getInvoiceList(){
        ResponseInvoice res = new ResponseInvoice();
        res.setInvoiceResultList(invoiceClientDao.selectInvoiceClientAll());
        return new ResponseEntity<ResponseInvoice>(res, HttpStatus.OK);
    }

    public ResponseEntity<ResponseInvoice> getInvoiceList(int invoice){
        ResponseInvoice res = new ResponseInvoice();
        List<InvoiceErrorEntity> errorList = res.getInvoiceErrorList();

        if(invoice == 0) {
            InvoiceErrorEntity errorEntity = new InvoiceErrorEntity();
            errorEntity.setErrorCode("40003");
            errorEntity.setErrorMessage("0以外を指定してください。");
            errorEntity.setErrorDetail("0以外を指定してください。");
            errorList.add(errorEntity);
            res.setInvoiceErrorList(errorList);
            return new ResponseEntity<ResponseInvoice>(res, HttpStatus.BAD_REQUEST);
        }

        res.setInvoiceResultList(invoiceClientDao.selectInvoiceClientFind(invoice));
        return new ResponseEntity<ResponseInvoice>(res, HttpStatus.OK);
    }

    public ResponseEntity<ResponseInvoice> insertInvoice(InsertInvoiceEntity insertInvoiceEntity){
    	ResponseInvoice res = new ResponseInvoice();
    	invoiceClientDao.insertInvoice(insertInvoiceEntity);
    	InvoiceLastInsertEntity lastInsertEntity = invoiceClientDao.selectLastInsert();
    	res.setInvoiceResultList(invoiceClientDao.selectInvoiceClientFind(lastInsertEntity.getLastInsertId()));
    	return new ResponseEntity<ResponseInvoice>(res, HttpStatus.OK);
    }
}