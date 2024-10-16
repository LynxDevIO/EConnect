package equipe.sputnik.EcoScout.Controller;

import equipe.sputnik.EcoScout.Model.Usuario.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UsuarioController {

    @GetMapping("/users")
    public List<Usuario> getItems() {
        return List.of(
                // new Usuario()...
        );
    }
}