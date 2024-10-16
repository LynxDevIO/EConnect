package equipe.sputnik.EcoScout.Controller;

import equipe.sputnik.EcoScout.Model.Premio.Premio;
import equipe.sputnik.EcoScout.Service.PremioService;
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
class PremioControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private PremioService premioService;

    @Test
    void testCreatePremio() throws Exception {
        String premioJson = "{\"tipoPremio\":1, \"nomePremio\":\"Medalha\", \"descricaoPremio\":\"Medalha de ouro\", \"caminhoImagem\":\"/images/medalha.png\", \"categoriaPremio\":1, \"pontuacaoNecessaria\":500, \"pontuacaoAtual\":0, \"pontuacaoAtingida\":false}";

        mockMvc.perform(post("/premios/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(premioJson))
                .andExpect(status().isCreated());
    }

    @Test
    void testGetPremioById() throws Exception {
        Premio premio = new Premio();
        premio.setIdPremio(1L);
        premioService.createPremio(premio);

        mockMvc.perform(get("/premios/1"))
                .andExpect(status().isOk());
    }

    @Test
    void testUpdatePremio() throws Exception {
        Premio premio = new Premio();
        premio.setIdPremio(1L);
        premioService.createPremio(premio);

        String updatedPremioJson = "{\"tipoPremio\":2, \"nomePremio\":\"Troféu\", \"descricaoPremio\":\"Troféu de prata\", \"caminhoImagem\":\"/images/trofeu.png\", \"categoriaPremio\":2, \"pontuacaoNecessaria\":1000, \"pontuacaoAtual\":0, \"pontuacaoAtingida\":false}";

        mockMvc.perform(put("/premios/update/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(updatedPremioJson))
                .andExpect(status().isOk());
    }

    @Test
    void testDeletePremio() throws Exception {
        Premio premio = new Premio();
        premio.setIdPremio(1L);
        premioService.createPremio(premio);

        mockMvc.perform(delete("/premios/delete/1"))
                .andExpect(status().isNoContent());
    }
}
