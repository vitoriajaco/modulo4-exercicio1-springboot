package com.exercicio.listaDeContatos.controller;


import com.exercicio.listaDeContatos.model.ContatoModel;
import com.exercicio.listaDeContatos.service.ContatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContatosController {
    @Autowired
    private ContatosService contatosService;

    @GetMapping(path = "/contatos")
    public List<ContatoModel> buscarTodosContatos() {
        return contatosService.mostrarTodosContatos();
    }

    @GetMapping(path = "/contatos/{codigo}")
    public Optional<ContatoModel>buscarPorId(@PathVariable Long codigo){
        return contatosService.buscarId(codigo);
    }


    @PostMapping(path = "/contatos")
    @ResponseStatus(HttpStatus.CREATED)
    public ContatoModel cadastrarContato(@RequestBody ContatoModel contatoModel) {
        return contatosService.cadastrar(contatoModel);

    }

    @PutMapping (path = "/contatos/{codigo}")
    public ContatoModel updateCadastro(@RequestBody ContatoModel contatoModel,
                                       @PathVariable Long codigo) {
        contatoModel.setCodigo(codigo);
        return contatosService.updateContato(contatoModel);

    }

    @DeleteMapping (path = "/contatos/{codigo}")
     public void deletarContato(@PathVariable Long codigo){
        contatosService.deletarContato(codigo);

    }

}



