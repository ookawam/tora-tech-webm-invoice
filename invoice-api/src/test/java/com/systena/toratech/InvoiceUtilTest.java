package com.systena.toratech;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.systena.toratech.Util.InvoiceUtil;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceUtilTest {
	@Test
	public void testInvoiceTestSample(){
        InvoiceUtil invoiceUtil = new InvoiceUtil();
        assertEquals(2, invoiceUtil.invoiceTestSample(1));
	}

}
