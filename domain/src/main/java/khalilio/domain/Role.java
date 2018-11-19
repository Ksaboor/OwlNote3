package khalilio.domain;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private int roleId;

    @Column(name = "role")
    private String role;

    public Role(){}

}