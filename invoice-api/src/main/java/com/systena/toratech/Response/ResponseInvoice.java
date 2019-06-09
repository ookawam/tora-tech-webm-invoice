package com.systena.toratech.Response;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.systena.toratech.Entity.InvoiceClientEntity;
import com.systena.toratech.Entity.InvoiceErrorEntity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class ResponseInvoice implements Response {
    /** The errors. */
    @JsonProperty("errors")
    private List<InvoiceErrorEntity> invoiceErrorList = new ArrayList<InvoiceErrorEntity>();

    /** The results. */
    @JsonProperty("results")
    private List<InvoiceClientEntity> invoiceResultList = new ArrayList<InvoiceClientEntity>();

}
