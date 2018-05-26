package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceClientController {
	@Autowired
    InvoiceClientService invoiceClientService;

	@CrossOrigin
    @RequestMapping(method = RequestMethod.GET)
    public List<InvoiceClientEntity> getInvoiceAll() {
        return invoiceClientService.getInvoiceList();
    }

	@CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value="{invoice_no}")
    public List<InvoiceClientEntity> getInvoiceFind(@PathVariable("invoice_no") int invoice_no) {
        return invoiceClientService.getInvoiceList(invoice_no);
    }

	@CrossOrigin
    @RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
    public int insertInvoice(@RequestBody InsertInvoiceEntity insertInvoiceEntity) {
        return invoiceClientService.insertInvoice(insertInvoiceEntity);
    }

}
