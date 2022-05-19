package SpringBoot.entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "compra")
@Data
public class Compra {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "com_id",unique = true, nullable = false)
    private Integer id;

    @Column(name = "com_horario")
    private String hor;

    @Column(name = "com_preco_total")
    private Double precoT;

    @ManyToOne
    @JoinColumn(name = "com_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "com_jog_id", referencedColumnName = "jog_id", nullable = false)
    private Jogo jogo;
}
