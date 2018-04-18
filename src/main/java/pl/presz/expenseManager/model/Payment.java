package pl.presz.expenseManager.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name="payments")
public class Payment {

    @Id
    private long paymentId;

    @Column
    private String method;

    @Column
    private int userId;

    @Column
    BigDecimal saldo;

    @Column
    boolean payable;


}
