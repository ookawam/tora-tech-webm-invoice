package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InvoiceClientService {

    @Autowired
    InvoiceClientDao invoiceClientDao;

    public List<InvoiceClientEntity> getInvoiceList(){
        return invoiceClientDao.selectInvoiceClientAll();
    }

    public List<InvoiceClientEntity> getInvoiceList(int invoice){
        return invoiceClientDao.selectInvoiceClientFind(invoice);
    }

    public int insertInvoice(InsertInvoiceEntity insertInvoiceEntity){
        return invoiceClientDao.insertInvoice(insertInvoiceEntity);
    }

}