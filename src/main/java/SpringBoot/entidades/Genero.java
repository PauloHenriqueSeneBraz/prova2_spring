package SpringBoot.entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "genero")
@Data
public class Genero {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "gen_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "gen_nome", length = 100, nullable = false, unique = true)
    private String nomeD;
}