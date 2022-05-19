package SpringBoot.entidades;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @Column(name = "usu_id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "usu_nome", length = 100, nullable = false, unique = true)
    private String nomeU;
    @Column(name = "usu_cpf", length = 100, nullable = false, unique = true)
    private String cpf;

    @Column(name = "usu_email", length = 100, nullable = false, unique = true)
    private String email;

    @Column(name = "usu_senha", length = 100, nullable = false, unique = true)
    private String senha;
}
