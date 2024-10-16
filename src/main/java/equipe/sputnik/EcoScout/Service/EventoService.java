package equipe.sputnik.EcoScout.Service;

import equipe.sputnik.EcoScout.Model.Evento.Evento;
import equipe.sputnik.EcoScout.Repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public Evento createEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    public Evento getEventoById(long id) {
        return eventoRepository.findById(id).orElse(null);
    }

    public Evento updateEvento(long id, Evento updatedEvento) {
        if (eventoRepository.existsById(id)) {
            updatedEvento.setIdEvento(id);  // Ensure the ID is maintained
            return eventoRepository.save(updatedEvento);
        }
        return null;
    }

    public boolean deleteEvento(long id) {
        if (eventoRepository.existsById(id)) {
            eventoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Evento> getAllEventos() {
        return eventoRepository.findAll();
    }
}
