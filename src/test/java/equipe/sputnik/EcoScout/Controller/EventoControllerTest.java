package equipe.sputnik.EcoScout.Controller;

import equipe.sputnik.EcoScout.Model.Evento.Evento;
import equipe.sputnik.EcoScout.Service.EventoService;
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
class EventoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private EventoService eventoService;

    @Test
    void testCreateEvento() throws Exception {
        String eventoJson = "{\"tipoEvento\":1, \"nomeEvento\":\"Evento Teste\", \"coordenadas\":\"-23.5505,-46.6333\", \"dataEvento\":\"2023-12-01\", \"duracaoEvento\":2.5}";

        mockMvc.perform(post("/eventos/create")
                .contentType(MediaType.APPLICATION_JSON)
                .content(eventoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void testGetEventoById() throws Exception {
        Evento evento = new Evento();
        evento.setIdEvento(1L);
        eventoService.createEvento(evento);

        mockMvc.perform(get("/eventos/1"))
                .andExpect(status().isOk());
    }

    @Test
    void testUpdateEvento() throws Exception {
        Evento evento = new Evento();
        evento.setIdEvento(1L);
        eventoService.createEvento(evento);

        String updatedEventoJson = "{\"tipoEvento\":2, \"nomeEvento\":\"Evento Atualizado\", \"coordenadas\":\"-23.5505,-46.6333\", \"dataEvento\":\"2023-12-02\", \"duracaoEvento\":3.0}";

        mockMvc.perform(put("/eventos/update/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(updatedEventoJson))
                .andExpect(status().isOk());
    }

    @Test
    void testDeleteEvento() throws Exception {
        Evento evento = new Evento();
        evento.setIdEvento(1L);
        eventoService.createEvento(evento);

        mockMvc.perform(delete("/eventos/delete/1"))
                .andExpect(status().isOk());
    }
}
