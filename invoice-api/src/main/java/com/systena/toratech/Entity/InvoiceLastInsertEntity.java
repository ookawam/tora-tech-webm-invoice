package com.systena.toratech.Entity;

import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
public class InvoiceLastInsertEntity {
    @Id
    @Column(name="last_insert_id()")
    private int lastInsertId;
}
