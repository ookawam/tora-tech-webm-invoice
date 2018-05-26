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
ON
  invoice.client_no = client.client_no;