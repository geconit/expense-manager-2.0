package pl.presz.expenseManager.repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.presz.expenseManager.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByNick(String nick);

}
