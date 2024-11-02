package br.edu.fatecfranca.apibd.service;

import br.edu.fatecfranca.apibd.dto.UsuarioDTO;
import br.edu.fatecfranca.apibd.model.Usuario;
import br.edu.fatecfranca.apibd.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    //Injeção de dependência
    @Autowired // Usar os métodos da classe sem instanciá-la
    UsuarioRepository usuarioRepository;

    //Lista todos os usuários
    public List<Usuario> listaTodos(){
        return usuarioRepository.findAll();
    }

    //Lista um usuário pelo id
    public Optional<Usuario> buscaPorID(Long id){
        return usuarioRepository.findById(id);
    }

    //Salva um usuário
    public Usuario salva(UsuarioDTO usuario){
        Usuario usuario1 = new Usuario();
        usuario1.setNome(usuario.getNome());
        usuario1.setUsername(usuario.getUsername());
        usuario1.setPassword(usuario.getPassword());

        return usuarioRepository.save(usuario1);
    }

    //Remove um usuário
    public void excluir(Long id){
        if (usuarioRepository.existsById(id)){
            usuarioRepository.deleteById(id);
        }
        else {
            throw new IllegalArgumentException("Usuário não encontrado ");
        }
    }

    //Atualiza um usuário
    public Usuario atualiza(UsuarioDTO usuario){
        if (usuarioRepository.existsById(usuario.getId())) {
            Usuario usuario1 = new Usuario();
            usuario1.setNome(usuario.getNome());
            usuario1.setPassword(usuario.getPassword());
            usuario1.setUsername(usuario.getUsername());
            usuario1.setId(usuario.getId());

            return usuarioRepository.save(usuario1);
        }
        else {
            throw new IllegalArgumentException("Usuário não encontrado ");
        }
    }
}