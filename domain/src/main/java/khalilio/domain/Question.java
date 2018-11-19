package khalilio.domain;

import lombok.Data;
import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Data
public class Question {

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String question;

    public Question(){}

    public Question(String question){
        this.question = question;
    }

}