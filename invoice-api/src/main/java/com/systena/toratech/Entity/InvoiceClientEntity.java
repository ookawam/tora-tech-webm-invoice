package com.systena.toratech.Entity;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
public class InvoiceClientEntity {
    @Id
    @Column(name="invoice_no")
    private Long invoiceNo;

    @Column(name="client_no")
    private Long clientNo;

    @Column(name="client_name")
    private String clientName;

    @Column(name="client_address")
    private String clientAddress;

    @Column(name="client_tel")
    private String clientTel;

    @Column(name="client_fax")
    private String clientFax;

    @Column(name="invoice_status")
    private String invoiceStatus;


    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_create_date",updatable=false)
    private Date invoiceCreateDate;

    @Column(name="invoice_title")
    private String invoiceTitle;

    @Column(name="invoice_amt")
    private Long invoiceAmt;


    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_start_date",updatable=false)
    private Date invoiceStartDate;

    @Temporal(TemporalType.DATE)
    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_end_date",updatable=false)
    private Date invoiceEndDate;

    @Column(name="invoice_note")
    private String invoiceNote;

    @Column(name="create_user")
    private String createUser;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Tokyo")
    @Column(name="create_datetime",updatable=false)
    private Date createDatetime;

    @Column(name="update_user")
    private String updateUser;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Tokyo")
    @Column(name="update_datetime",updatable=false)
    private Date updateDateTime;


}
