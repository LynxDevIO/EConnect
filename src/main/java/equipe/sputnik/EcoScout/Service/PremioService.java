package equipe.sputnik.EcoScout.Service;

import equipe.sputnik.EcoScout.Model.Premio.Premio;
import equipe.sputnik.EcoScout.Repository.PremioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PremioService {

    @Autowired
    private PremioRepository premioRepository;

    public Premio createPremio(Premio premio) {
        return premioRepository.save(premio);
    }

    public Premio getPremioById(long id) {
        return premioRepository.findById(id).orElse(null);
    }

    public Premio updatePremio(long id, Premio updatedPremio) {
        if (premioRepository.existsById(id)) {
            updatedPremio.setIdPremio(id);  // Ensure the ID is maintained
            return premioRepository.save(updatedPremio);
        }
        return null;
    }

    public boolean deletePremio(long id) {
        if (premioRepository.existsById(id)) {
            premioRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Premio> getAllPremios() {
        return premioRepository.findAll();
    }
}
