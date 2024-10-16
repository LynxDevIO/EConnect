package equipe.sputnik.EcoScout.Controller;

import equipe.sputnik.EcoScout.Model.Evento.Evento;
import equipe.sputnik.EcoScout.Service.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    // Create a new event
    @PostMapping("/create")
    public ResponseEntity<Evento> createEvento(@RequestBody Evento evento) {
        Evento createdEvento = eventoService.createEvento(evento);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdEvento);
    }

    // Get event details by ID
    @GetMapping("/{id}")
    public ResponseEntity<Evento> getEvento(@PathVariable long id) {
        Evento evento = eventoService.getEventoById(id);
        if (evento != null) {
            return ResponseEntity.ok(evento);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // Update an event
    @PutMapping("/update/{id}")
    public ResponseEntity<Evento> updateEvento(@PathVariable long id, @RequestBody Evento evento) {
        Evento updatedEvento = eventoService.updateEvento(id, evento);
        if (updatedEvento != null) {
            return ResponseEntity.ok(updatedEvento);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // Delete an event
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEvento(@PathVariable long id) {
        boolean deleted = eventoService.deleteEvento(id);
        if (deleted) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // Get all events
    @GetMapping("/all")
    public ResponseEntity<List<Evento>> getAllEventos() {
        List<Evento> eventos = eventoService.getAllEventos();
        return ResponseEntity.ok(eventos);
    }
}
