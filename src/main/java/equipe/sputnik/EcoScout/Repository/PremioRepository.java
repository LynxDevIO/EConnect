package equipe.sputnik.EcoScout.Repository;

import equipe.sputnik.EcoScout.Model.Premio.Premio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PremioRepository extends JpaRepository<Premio, Long> {
    // Additional query methods can be defined here if needed
}
