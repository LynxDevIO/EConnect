package equipe.sputnik.EcoScout.Repository;

import equipe.sputnik.EcoScout.Model.Comunidade.Comunidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComunidadeRepository extends JpaRepository<Comunidade, Long> {
    // Additional query methods can be defined here if needed
}
