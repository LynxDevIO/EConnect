package equipe.sputnik.EcoScout.Service;

import equipe.sputnik.EcoScout.Model.Evento.Evento;
import equipe.sputnik.EcoScout.Repository.EventoRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class EventoServiceTest {

    @Mock
    private EventoRepository eventoRepository;

    @InjectMocks
    private EventoService eventoService;

    private MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(eventoService).build();
    }

    @Test
    void testCreateEvento() {
        Evento evento = new Evento();
        when(eventoRepository.save(evento)).thenReturn(evento);

        Evento createdEvento = eventoService.createEvento(evento);
        assertNotNull(createdEvento);
        verify(eventoRepository, times(1)).save(evento);
    }

    @Test
    void testGetEventoById() {
        Evento evento = new Evento();
        when(eventoRepository.findById(1L)).thenReturn(Optional.of(evento));

        Evento foundEvento = eventoService.getEventoById(1L);
        assertNotNull(foundEvento);
        verify(eventoRepository, times(1)).findById(1L);
    }

    @Test
    void testUpdateEvento() {
        Evento evento = new Evento();
        when(eventoRepository.existsById(1L)).thenReturn(true);
        when(eventoRepository.save(evento)).thenReturn(evento);

        Evento updatedEvento = eventoService.updateEvento(1L, evento);
        assertNotNull(updatedEvento);
        verify(eventoRepository, times(1)).save(evento);
    }

    @Test
    void testDeleteEvento() throws Exception {
        Evento evento = new Evento();
        evento.setIdEvento(1L);
        eventoService.createEvento(evento);

        mockMvc.perform(delete("/eventos/delete/1"))
                .andExpect(status().isNoContent()); // Expect 204 No Content
    }
}
