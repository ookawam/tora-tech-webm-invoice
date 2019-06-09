package com.systena.toratech.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InvoiceErrorEntity {
    /** The error code. */
    private String errorCode;

    /** The error message. */
    private String errorMessage;

    /** The error detail. */
    private String errorDetail;
}
