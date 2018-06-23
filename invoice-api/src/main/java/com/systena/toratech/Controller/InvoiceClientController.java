package com.systena.toratech.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.systena.toratech.Entity.InsertInvoiceEntity;
import com.systena.toratech.Response.ResponseInvoice;
import com.systena.toratech.Service.InvoiceClientService;

@CrossOrigin
@RestController
@RequestMapping("/invoice")
public class InvoiceClientController {
	@Autowired
    InvoiceClientService invoiceClientService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<ResponseInvoice> getInvoiceAll() {
        return invoiceClientService.getInvoiceList();
    }

    @RequestMapping(method = RequestMethod.GET, value="{invoice_no}")
    public ResponseEntity<ResponseInvoice> getInvoiceFind(@PathVariable("invoice_no") int invoice_no) {
        return invoiceClientService.getInvoiceList(invoice_no);
    }

    @RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseInvoice> insertInvoice(@RequestBody InsertInvoiceEntity insertInvoiceEntity) {
        return invoiceClientService.insertInvoice(insertInvoiceEntity);
    }

}
