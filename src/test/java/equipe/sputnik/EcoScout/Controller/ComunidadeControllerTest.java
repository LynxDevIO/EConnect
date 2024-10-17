package equipe.sputnik.EcoScout.Controller;

import equipe.sputnik.EcoScout.Model.Comunidade.Comunidade;
import equipe.sputnik.EcoScout.Service.ComunidadeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
class ComunidadeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ComunidadeService comunidadeService;

    @Test
    void testCreateComunidade() throws Exception {
        String comunidadeJson = "{\"nome\":\"Comunidade Teste\", \"qualidadePremiacao\":2}";

        mockMvc.perform(post("/comunidades/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(comunidadeJson))
                .andExpect(status().isCreated());
    }

    @Test
    void testGetComunidadeById() throws Exception {
        Comunidade comunidade = new Comunidade();
        comunidade.setIdComunidade(1L);
        comunidadeService.createComunidade(comunidade);

        mockMvc.perform(get("/comunidades/1"))
                .andExpect(status().isOk());
    }

    @Test
    void testUpdateComunidade() throws Exception {
        Comunidade comunidade = new Comunidade();
        comunidade.setIdComunidade(1L);
        comunidadeService.createComunidade(comunidade);

        String updatedComunidadeJson = "{\"nome\":\"Comunidade Atualizada\", \"qualidadePremiacao\":3}";

        mockMvc.perform(put("/comunidades/update/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(updatedComunidadeJson))
                .andExpect(status().isOk());
    }

    @Test
    void testDeleteComunidade() throws Exception {
        Comunidade comunidade = new Comunidade();
        comunidade.setIdComunidade(1L);
        comunidadeService.createComunidade(comunidade);

        mockMvc.perform(delete("/comunidades/delete/1"))
                .andExpect(status().isNoContent());
    }
}