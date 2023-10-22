package med.voll.api.controller;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("alergias")
public class AlergiasController {
    @Autowired
    private AlergiasRepository alergiasRepository;

    @CrossOrigin
    @GetMapping("/identificador")
    public List<Alergias> buscarPorIdentificador(@RequestParam Long identificador) {
        return alergiasRepository.findByIdentificador(identificador);
    }


    @CrossOrigin
    @Transactional
    @PostMapping("/inserir")
    public String inserirAlergia(@RequestParam("identificador") Long identificador, @RequestParam("alergias") String alergia) {
        Alergias novaAlergia = new Alergias();
        novaAlergia.setIdentificador(identificador);
        novaAlergia.setAlergia(alergia);
        alergiasRepository.save(novaAlergia);
        return "Registro de alergia inserido com sucesso!";
    }







}
