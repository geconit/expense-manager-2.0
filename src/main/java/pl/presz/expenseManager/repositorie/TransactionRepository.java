package pl.presz.expenseManager.repositorie;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.presz.expenseManager.model.Transaction;

import java.time.LocalDate;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "transactions", path = "transactions")
public interface TransactionRepository extends JpaRepository<Transaction, Long>{

    public List<Transaction> findByTransactionDateBetween(LocalDate start, LocalDate end);

}
