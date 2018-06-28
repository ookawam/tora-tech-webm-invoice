package com.systena.toratech;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit4.SpringRunner;

import com.systena.toratech.Service.InvoiceClientService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceApiApplicationTests {

	private InvoiceClientService invoiceClientService;

	@Before
	public void setUp() {
		invoiceClientService = new InvoiceClientService();
	}

	@Test
	public void testGetInvoiceNoError() {
		assertThat(invoiceClientService.getInvoiceList(0).getStatusCode(), is(HttpStatus.BAD_REQUEST));

	}

}
