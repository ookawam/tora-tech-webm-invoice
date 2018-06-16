package com.systena.toratech.Entity;

import java.util.Date;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;

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
public class InsertInvoiceEntity {

    @Column(name="client_no")
    private Long clientNo;

    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_start_date")
    private Date invoiceStartDate;

    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_end_date")
    private Date invoiceEndDate;

    @Column(name="create_user")
    private String createUser;

    @JsonFormat(pattern = "yyyy/MM/dd", timezone = "Asia/Tokyo")
    @Column(name="invoice_create_date")
    private Date invoiceCreateDate;

}
