package equipe.sputnik.EcoScout.Repository;

import equipe.sputnik.EcoScout.Model.Usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}