package equipe.sputnik.EcoScout.Service;

import equipe.sputnik.EcoScout.Model.Premio.Premio;
import equipe.sputnik.EcoScout.Repository.PremioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
@TestPropertySource(locations = "classpath:application-test.properties")
class PremioServiceTest {

    @Mock
    private PremioRepository premioRepository;

    @InjectMocks
    private PremioService premioService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testCreatePremio() {
        Premio premio = new Premio();
        when(premioRepository.save(premio)).thenReturn(premio);

        Premio createdPremio = premioService.createPremio(premio);
        assertNotNull(createdPremio);
        verify(premioRepository, times(1)).save(premio);
    }

    @Test
    void testGetPremioById() {
        Premio premio = new Premio();
        when(premioRepository.findById(1L)).thenReturn(Optional.of(premio));

        Premio foundPremio = premioService.getPremioById(1L);
        assertNotNull(foundPremio);
        verify(premioRepository, times(1)).findById(1L);
    }

    @Test
    void testUpdatePremio() {
        Premio premio = new Premio();
        when(premioRepository.existsById(1L)).thenReturn(true);
        when(premioRepository.save(premio)).thenReturn(premio);

        Premio updatedPremio = premioService.updatePremio(1L, premio);
        assertNotNull(updatedPremio);
        verify(premioRepository, times(1)).save(premio);
    }

    @Test
    void testDeletePremio() {
        when(premioRepository.existsById(1L)).thenReturn(true);

        boolean isDeleted = premioService.deletePremio(1L);
        assertTrue(isDeleted);
        verify(premioRepository, times(1)).deleteById(1L);
    }
}
