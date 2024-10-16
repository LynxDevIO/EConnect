package equipe.sputnik.EcoScout.Service;

import equipe.sputnik.EcoScout.Model.Usuario.Usuario;
import equipe.sputnik.EcoScout.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean login(String username, String password) {
        Optional<Usuario> usuario = usuarioRepository.findByUsuario(username);
        return usuario.isPresent() && usuario.get().getPassword().equals(password);
    }

    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario getUsuarioById(long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Usuario updateUsuario(long id, Usuario updatedUsuario) {
        if (usuarioRepository.existsById(id)) {
            updatedUsuario.setIdUsuario(id);  // Garantir que o ID seja mantido
            return usuarioRepository.save(updatedUsuario);
        }
        return null;
    }

    public boolean deleteUsuario(long id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}