package khalilio.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Responses")
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "responses")

    private String response;

    public Response(){}

}