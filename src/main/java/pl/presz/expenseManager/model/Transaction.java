package pl.presz.expenseManager.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name ="transactions")
public class Transaction {

    @Id
    private long transactionId;

    private LocalDateTime createDate;

    private LocalDate transactionDate;

    private BigDecimal amount;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="paymentId")
    private Payment payment;

    private BigDecimal amountLeftWithoutExpens;




}
