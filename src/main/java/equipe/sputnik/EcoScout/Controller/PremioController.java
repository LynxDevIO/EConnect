package equipe.sputnik.EcoScout.Controller;

import equipe.sputnik.EcoScout.Model.Premio.Premio;
import equipe.sputnik.EcoScout.Service.PremioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/premios")
public class PremioController {

    @Autowired
    private PremioService premioService;

    // Create a new award
    @PostMapping("/create")
    public ResponseEntity<Premio> createPremio(@RequestBody Premio premio) {
        Premio createdPremio = premioService.createPremio(premio);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdPremio);
    }

    // Get award details by ID
    @GetMapping("/{id}")
    public ResponseEntity<Premio> getPremio(@PathVariable long id) {
        Premio premio = premioService.getPremioById(id);
        if (premio != null) {
            return ResponseEntity.ok(premio);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // Update an award
    @PutMapping("/update/{id}")
    public ResponseEntity<Premio> updatePremio(@PathVariable long id, @RequestBody Premio premio) {
        Premio updatedPremio = premioService.updatePremio(id, premio);
        if (updatedPremio != null) {
            return ResponseEntity.ok(updatedPremio);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    // Delete an award
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deletePremio(@PathVariable long id) {
        boolean deleted = premioService.deletePremio(id);
        if (deleted) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    // Get all awards
    @GetMapping("/all")
    public ResponseEntity<List<Premio>> getAllPremios() {
        List<Premio> premios = premioService.getAllPremios();
        return ResponseEntity.ok(premios);
    }
}
