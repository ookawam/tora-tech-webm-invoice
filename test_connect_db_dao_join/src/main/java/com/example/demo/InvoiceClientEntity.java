package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.seasar.doma.Entity;
import org.seasar.doma.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
public class InvoiceClientEntity {
    @Id
    @Column(name="invoice_no")
    private Long invoice_no;

    @Column(name="client_no")
    private Long client_no;

    @Column(name="client_name")
    private String client_name;

    @Column(name="client_address")
    private String client_address;

    @Column(name="client_tel")
    private String client_tel;

    @Column(name="client_fax")
    private String client_fax;

    @Column(name="invoice_status")
    private String invoice_status;


    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_create_date",updatable=false)
    private Date invoice_create_date;

    @Column(name="invoice_title")
    private String invoice_title;

    @Column(name="invoice_amt")
    private Long invoice_amt;


    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_start_date",updatable=false)
    private Date invoice_start_date;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_end_date",updatable=false)
    private Date invoice_end_date;

    @Column(name="invoice_note")
    private String invoice_note;

    @Column(name="create_user")
    private String create_user;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Tokyo")
    @Column(name="create_datetime",updatable=false)
    private Date create_datetime;

    @Column(name="update_user")
    private String update_user;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Tokyo")
    @Column(name="update_datetime",updatable=false)
    private Date update_datetime;

	public Long getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(Long invoice_no) {
		this.invoice_no = invoice_no;
	}

	public Long getClient_no() {
		return client_no;
	}

	public void setClient_no(Long client_no) {
		this.client_no = client_no;
	}

	public String getClient_name() {
		return client_name;
	}

	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

	public String getClient_address() {
		return client_address;
	}

	public void setClient_address(String client_address) {
		this.client_address = client_address;
	}

	public String getClient_tel() {
		return client_tel;
	}

	public void setClient_tel(String client_tel) {
		this.client_tel = client_tel;
	}

	public String getClient_fax() {
		return client_fax;
	}

	public void setClient_fax(String client_fax) {
		this.client_fax = client_fax;
	}

	public String getInvoice_status() {
		return invoice_status;
	}

	public void setInvoice_status(String invoice_status) {
		this.invoice_status = invoice_status;
	}

	public Date getInvoice_create_date() {
		return invoice_create_date;
	}

	public void setInvoice_create_date(Date invoice_create_date) {
		this.invoice_create_date = invoice_create_date;
	}

	public String getInvoice_title() {
		return invoice_title;
	}

	public void setInvoice_title(String invoice_title) {
		this.invoice_title = invoice_title;
	}

	public Long getInvoice_amt() {
		return invoice_amt;
	}

	public void setInvoice_amt(Long invoice_amt) {
		this.invoice_amt = invoice_amt;
	}

	public Date getInvoice_start_date() {
		return invoice_start_date;
	}

	public void setInvoice_start_date(Date invoice_start_date) {
		this.invoice_start_date = invoice_start_date;
	}

	public Date getInvoice_end_date() {
		return invoice_end_date;
	}

	public void setInvoice_end_date(Date invoice_end_date) {
		this.invoice_end_date = invoice_end_date;
	}

	public String getInvoice_note() {
		return invoice_note;
	}

	public void setInvoice_note(String invoice_note) {
		this.invoice_note = invoice_note;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public Date getCreate_datetime() {
		return create_datetime;
	}

	public void setCreate_datetime(Date create_datetime) {
		this.create_datetime = create_datetime;
	}

	public String getUpdate_user() {
		return update_user;
	}

	public void setUpdate_user(String update_user) {
		this.update_user = update_user;
	}

	public Date getUpdate_datetime() {
		return update_datetime;
	}

	public void setUpdate_datetime(Date update_datetime) {
		this.update_datetime = update_datetime;
	}





}
