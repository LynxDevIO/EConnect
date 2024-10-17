package equipe.sputnik.EcoScout.Controller;

import equipe.sputnik.EcoScout.Model.Comunidade.Comunidade;
import equipe.sputnik.EcoScout.Service.ComunidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/comunidades")
public class ComunidadeController {

    @Autowired
    private ComunidadeService comunidadeService;

    @PostMapping("/create")
    public ResponseEntity<Comunidade> createComunidade(@RequestBody Comunidade comunidade) {
        Comunidade createdComunidade = comunidadeService.createComunidade(comunidade);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdComunidade);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comunidade> getComunidade(@PathVariable long id) {
        Optional<Comunidade> optionalComunidade = comunidadeService.getComunidadeById(id);
        return optionalComunidade.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Comunidade> updateComunidade(@PathVariable long id, @RequestBody Comunidade comunidade) {
        Optional<Comunidade> optionalUpdatedComunidade = comunidadeService.updateComunidade(id, comunidade);
        return optionalUpdatedComunidade.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteComunidade(@PathVariable long id) {
        boolean deleted = comunidadeService.deleteComunidade(id);
        if (deleted) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Comunidade>> getAllComunidades() {
        List<Comunidade> comunidades = comunidadeService.getAllComunidades();
        return ResponseEntity.ok(comunidades);
    }
}
