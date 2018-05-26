package com.example.demo;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

@Dao
@ConfigAutowireable
public interface InvoiceClientDao {
    @Select
    List<InvoiceClientEntity> selectInvoiceClientAll();

    @Select
    List<InvoiceClientEntity> selectInvoiceClientFind(int invoice_no);

    @Insert(sqlFile = true)
    int insertInvoice(InsertInvoiceEntity insertInvoiceEntity);
}