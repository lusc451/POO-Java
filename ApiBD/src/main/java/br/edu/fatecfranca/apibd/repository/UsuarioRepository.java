package br.edu.fatecfranca.apibd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.fatecfranca.apibd.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    //Essa interface terá as operações de CRUD com a entidade Usuario


}
