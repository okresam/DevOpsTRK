package zavrsni.devopstrk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zavrsni.devopstrk.model.Uloga;
import zavrsni.devopstrk.repository.UlogaRepository;
import zavrsni.devopstrk.service.UlogaService;

import java.util.List;
import java.util.Optional;

@Service
public class UlogaServiceJpa implements UlogaService {

    @Autowired
    private UlogaRepository ulogaRepository;


    @Override
    public List<Uloga> listAll() {
        return ulogaRepository.findAll();
    }

    @Override
    public Optional<Uloga> findById(Long idUloge) {
        return ulogaRepository.findById(idUloge);
    }

    @Override
    public void deleteById(Long idUloge) {
        ulogaRepository.deleteByIdUloge(idUloge);
    }

    @Override
    public void updateUloga(Uloga uloga) {
        ulogaRepository.save(uloga);
    }

    @Override
    public Uloga createUloga(Uloga uloga) {
        return ulogaRepository.save(uloga);
    }
}
