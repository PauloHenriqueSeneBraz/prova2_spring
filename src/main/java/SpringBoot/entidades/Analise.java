package SpringBoot.entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "analise")
@Data
public class Analise {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "ana_id" ,unique = true, nullable = false)
    private Integer id;

    @Column(name = "ana_data")
    private String data;

    @Column(name = "ana_titulo", length = 100, nullable = false, unique = true)
    private String tituloA;

    @Column(name = "ana_descricao", length = 100, nullable = false, unique = true)
    private String descricao;

    @Column(name = "ana_situacao", length = 100, nullable = false, unique = true)
    private String situacao;

    @ManyToOne
    @JoinColumn(name = "ana_usu_id", referencedColumnName = "usu_id", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ana_jog_id", referencedColumnName = "jog_id", nullable = false)
    private Jogo jogo;

}
