package pl.presz.expenseManager.repositorie;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.presz.expenseManager.model.Payment;

@RepositoryRestResource(collectionResourceRel = "payments", path = "payments")
public interface PaymentRepository extends JpaRepository<Payment, Long>{


}
