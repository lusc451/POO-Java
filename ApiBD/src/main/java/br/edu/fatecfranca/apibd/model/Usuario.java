package br.edu.fatecfranca.apibd.model;
import jakarta.persistence.*;
import lombok.Data;
import javax.annotation.processing.Generated;

// ORM - Object Relational Mapping - Mapeamento Objeto Relacional
// mapeamento de classes em tabelas e relacionamentos em Java, utilizando JPA (Java Persistence API) e o Hibernate

@Data // lombok - gera automaticamente getters, setters e construtores
@Entity // informa que a classe é uma entidade de banco de dados
@Table(name="tb_usuario") // informa que a classe está relacionada a uma tabela chamada tb_usuario

public class Usuario {

    @Id // variável id é a chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // chave é do tipo serial (inteiro auto-incremento)
    private Long id;
    private String username;
    private String password;
    private String nome;
}
