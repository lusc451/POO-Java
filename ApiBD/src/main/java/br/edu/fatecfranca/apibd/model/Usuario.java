package br.edu.fatecfranca.apibd.model;
import jakarta.persistence.*;
import lombok.Data;
import javax.annotation.processing.Generated;

@Data
@Entity
@Table(name="tb_usuario")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String nome;
}
