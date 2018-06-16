package com.systena.toratech.Dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.boot.ConfigAutowireable;

import com.systena.toratech.Entity.InsertInvoiceEntity;
import com.systena.toratech.Entity.InvoiceClientEntity;

@Dao
@ConfigAutowireable
public interface InvoiceClientDao {
    @Select
    List<InvoiceClientEntity> selectInvoiceClientAll();

    @Select
    List<InvoiceClientEntity> selectInvoiceClientFind(int invoiceNo);

    @Insert(sqlFile = true)
    int insertInvoice(InsertInvoiceEntity insertInvoiceEntity);

}