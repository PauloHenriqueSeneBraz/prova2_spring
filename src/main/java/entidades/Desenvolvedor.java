package entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "desenvolvedor")
@Data
public class Desenvolvedor {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "dev_id",unique = true, nullable = false)
    private Integer id;

    @Column(name = "dev_nome", length = 100, nullable = false, unique = true)
    private String nomeD;
}
