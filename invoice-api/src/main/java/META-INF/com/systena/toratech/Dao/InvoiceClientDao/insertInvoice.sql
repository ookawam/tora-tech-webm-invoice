INSERT INTO invoice(client_no,invoice_status,invoice_start_date,invoice_amt,invoice_end_date,create_user,update_user,invoice_create_date)
VALUES(
  /* insertInvoiceEntity.clientNo */0,
  "10",
  /* insertInvoiceEntity.invoiceStartDate */'2018-01-01',
  (
      SELECT SUM(item_price*item_count)
      FROM ord
      WHERE update_datetime BETWEEN /* insertInvoiceEntity.invoiceStartDate */'2018-01-01' AND /* insertInvoiceEntity.invoiceEndDate */'2099-01-01'
            AND client_no=/* insertInvoiceEntity.clientNo */0
      ),
  /* insertInvoiceEntity.invoiceEndDate */'2099-01-01',
  /* insertInvoiceEntity.createUser */'hoge',
  "web",
  /* insertInvoiceEntity.invoiceCreateDate */'2018-05-01');