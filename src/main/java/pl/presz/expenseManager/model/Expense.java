package pl.presz.expenseManager.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "expenses")
@Getter
@Setter
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long expenseId;

    @Column
    private long transactionId;

    @Column
    private long categoryId;

    @Column
    private long userId;

    @Column
    private Long refundId;

    @Column
    private BigDecimal amount;

    @Column
    private String description;

    @Column
    private Long oldTransactionId;

    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date create_date;

    @Column
    private boolean invoice;

}
