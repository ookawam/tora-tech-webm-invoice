
INSERT INTO invoice(client_no,invoice_start_date,invoice_end_date,create_user,invoice_create_date)
VALUES(/*insertInvoiceEntity.client_no*/0, /* insertInvoiceEntity.invoice_start_date */'2018-05-26', /* insertInvoiceEntity.invoice_end_date */'2018-05-26', /* insertInvoiceEntity.create_user */'hoge', /* insertInvoiceEntity.invoice_create_date */'2018-05-26')
SELECT
  invoice.invoice_no,
  invoice.client_no,
  client.client_name,
  client.client_address,
  client.client_tel,
  client.client_fax,
  invoice.invoice_status,
  invoice.invoice_create_date,
  invoice.invoice_title,
  invoice.invoice_amt,
  invoice.invoice_start_date,
  invoice.invoice_end_date,
  invoice.invoice_note,
  invoice.create_user,
  invoice.create_datetime,
  invoice.update_user,
  invoice.update_datetime
FROM
  invoice LEFT OUTER JOIN client