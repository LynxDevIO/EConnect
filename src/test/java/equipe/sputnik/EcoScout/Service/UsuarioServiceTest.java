package equipe.sputnik.EcoScout.Service;

import equipe.sputnik.EcoScout.Model.Usuario.Usuario;
import equipe.sputnik.EcoScout.Repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class UsuarioServiceTest {
    @Mock
    private UsuarioRepository usuarioRepository;

    @InjectMocks
    private UsuarioService usuarioService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testLoginSuccess() {
        Usuario usuario = new Usuario();
        usuario.setUsuario("testUser");
        usuario.setPassword("testPass");

        when(usuarioRepository.findByUsuario("testUser")).thenReturn(Optional.of(usuario));

        boolean result = usuarioService.login("testUser", "testPass");
        assertTrue(result);
    }

    @Test
    void testLoginFailure() {
        when(usuarioRepository.findByUsuario("testUser")).thenReturn(Optional.empty());

        boolean result = usuarioService.login("testUser", "wrongPass");
        assertFalse(result);
    }
}