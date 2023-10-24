package med.voll.api.controller;
import med.voll.api.medico.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("muc")
public class MucController {
    @Autowired
    private MucRepository mucRepository;

    @CrossOrigin
    @GetMapping("/identificador")
    public List<med.voll.api.medico.Muc> buscarPorIdentificador(@RequestParam Long identificador) {
        return mucRepository.findByIdentificador(identificador);
    }

    @CrossOrigin
    @Transactional
    @PostMapping("/inserir")
    public String inserirMuc(@RequestParam("identificador") Long identificador, @RequestParam("muc") String muc) {
        Muc novaMuc = new Muc();
        novaMuc.setIdentificador(identificador);
        novaMuc.setMuc(muc);
        mucRepository.save(novaMuc);
        return "Registro de alergia inserido com sucesso!";
    }



    @DeleteMapping()
    @Transactional
    @CrossOrigin
    public void excluirMuc(@RequestParam Long identificador, @RequestParam String muc) {
        List<Muc> muc1 = mucRepository.findByIdentificadorAndMuc(identificador, muc);

        muc1.forEach(result -> {
            mucRepository.delete(result);
        });


    }}