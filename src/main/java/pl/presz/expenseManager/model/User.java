package pl.presz.expenseManager.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column
    private String email;

    @Column
    private String name;

    @Column
    private String surname;

    @Column(nullable = false, unique = true)
    private String nick;

    @Column
    private String adress;

    @Column(nullable = false)
    private boolean virtual;

    @Column (nullable = false)
    private String password;
}
