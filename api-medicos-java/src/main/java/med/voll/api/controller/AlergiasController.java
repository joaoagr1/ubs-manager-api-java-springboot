package med.voll.api.controller;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("alergias")
public class AlergiasController {
    @Autowired
    private AlergiasRepository alergiasRepository;

    @GetMapping("/{id}")
    public Optional<Alergias> buscarPorIdMedico(@PathVariable Long id) {
        return alergiasRepository.findById(id);
    }
}
