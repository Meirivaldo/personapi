package one.dio.com.personapi;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) //A inserção dos dados passam a serem onrigatotios!
    private String firstName;

    @Column(nullable = false) //A inserção dos dados passam a serem onrigatotios!
    private String lastName;

    @Column(nullable = false, unique = true)//A inserção dos dados passam a serem onrigatotios!
    private String cpf;

    private LocalDate birthDate; ////A inserção dos dados não são obrigatorios!

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phone;
}
