package entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "jogo")
@Data
public class Jogo {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "jog_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "jog_titulo", length = 100, nullable = false, unique = true)
    private String tituloJ;

    @Column(name = "jog_preco_unitario")
    private Double precoUni;

    @ManyToOne
    @JoinColumn(name = "jog_gen_id", referencedColumnName = "gen_id", nullable = false)
    private Genero genero;

    @ManyToOne
    @JoinColumn(name = "jog_dev_id", referencedColumnName = "dev_id", nullable = false)
    private Desenvolvedor desenvolvedor;
}

