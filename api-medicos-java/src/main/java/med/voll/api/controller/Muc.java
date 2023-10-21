package med.voll.api.controller;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("muc")
public class Muc {
    @Autowired
    private MucRepository mucRepository;

    @CrossOrigin
    @GetMapping("/identificador")
    public List<med.voll.api.medico.Muc> buscarPorIdentificador(@RequestParam Long identificador) {
        return mucRepository.findByIdentificador(identificador);
    }
}