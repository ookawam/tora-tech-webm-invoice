package com.example.demo;

import java.util.Date;

import javax.persistence.Column;

import org.seasar.doma.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
public class InsertInvoiceEntity {

    @Column(name="client_no")
    private Long client_no;

    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_start_date")
    private Date invoice_start_date;

    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_end_date")
    private Date invoice_end_date;

    @Column(name="create_user")
    private String create_user;

    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_create_date")
    private Date invoice_create_date;

	public Long getClient_no() {
		return client_no;
	}

	public void setClient_no(Long client_no) {
		this.client_no = client_no;
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

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public Date getInvoice_create_date() {
		return invoice_create_date;
	}

	public void setInvoice_create_date(Date invoice_create_date) {
		this.invoice_create_date = invoice_create_date;
	}

}
