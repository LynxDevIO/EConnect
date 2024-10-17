package equipe.sputnik.EcoScout.Repository;

import equipe.sputnik.EcoScout.Model.Evento.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {
}
