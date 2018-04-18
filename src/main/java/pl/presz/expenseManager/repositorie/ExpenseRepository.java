package pl.presz.expenseManager.repositorie;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.presz.expenseManager.model.Expense;

@RepositoryRestResource(collectionResourceRel = "expenses", path = "expenses")
public interface ExpenseRepository extends JpaRepository<Expense, Long>{


}
