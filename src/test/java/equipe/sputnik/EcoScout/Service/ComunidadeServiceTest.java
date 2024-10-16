package equipe.sputnik.EcoScout.Service;

import equipe.sputnik.EcoScout.Model.Comunidade.Comunidade;
import equipe.sputnik.EcoScout.Repository.ComunidadeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class ComunidadeServiceTest {

    @Mock
    private ComunidadeRepository comunidadeRepository;

    @InjectMocks
    private ComunidadeService comunidadeService;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(comunidadeService).build();
    }

    @Test
    void testCreateComunidade() {
        Comunidade comunidade = new Comunidade();
        when(comunidadeRepository.save(comunidade)).thenReturn(comunidade);

        Comunidade createdComunidade = comunidadeService.createComunidade(comunidade);
        assertNotNull(createdComunidade);
        verify(comunidadeRepository, times(1)).save(comunidade);
    }

    @Test
    void testGetComunidadeById() {
        Comunidade comunidade = new Comunidade();
        when(comunidadeRepository.findById(1L)).thenReturn(Optional.of(comunidade));

        Optional<Comunidade> foundComunidade = comunidadeService.getComunidadeById(1L);
        assertNotNull(foundComunidade);
        verify(comunidadeRepository, times(1)).findById(1L);
    }

    @Test
    void testUpdateComunidade() throws Exception {
        // Create and persist a Comunidade entity
        Comunidade comunidade = new Comunidade();
        comunidade.setNome("Initial Name");
        comunidadeService.createComunidade(comunidade);

        // Prepare updated data
        String updatedComunidadeJson = "{\"nome\":\"Comunidade Atualizada\", \"qualidadePremiacao\":3}";

        // Perform the update request
        mockMvc.perform(put("/comunidades/update/" + comunidade.getIdComunidade())
                .contentType(MediaType.APPLICATION_JSON)
                .content(updatedComunidadeJson))
                .andExpect(status().isOk());
    }

    @Test
    void testDeleteComunidade() {
        when(comunidadeRepository.existsById(1L)).thenReturn(true);

        boolean isDeleted = comunidadeService.deleteComunidade(1L);
        assertTrue(isDeleted);
        verify(comunidadeRepository, times(1)).deleteById(1L);
    }
}
