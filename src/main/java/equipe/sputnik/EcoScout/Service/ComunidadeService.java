package equipe.sputnik.EcoScout.Service;

import equipe.sputnik.EcoScout.Model.Comunidade.Comunidade;
import equipe.sputnik.EcoScout.Repository.ComunidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ComunidadeService {

    @Autowired
    private ComunidadeRepository comunidadeRepository;

    @Transactional
    public Comunidade createComunidade(Comunidade comunidade) {
        return comunidadeRepository.save(comunidade);
    }

    public Optional<Comunidade> getComunidadeById(long id) {
        return comunidadeRepository.findById(id);
    }

    @Transactional
    public Optional<Comunidade> updateComunidade(long id, Comunidade updatedComunidade) {
        if (comunidadeRepository.existsById(id)) {
            updatedComunidade.setIdComunidade(id);  // Ensure the ID is maintained
            return Optional.of(comunidadeRepository.save(updatedComunidade));
        }
        return Optional.empty();
    }

    @Transactional
    public boolean deleteComunidade(long id) {
        if (comunidadeRepository.existsById(id)) {
            comunidadeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Comunidade> getAllComunidades() {
        return comunidadeRepository.findAll();
    }
}
