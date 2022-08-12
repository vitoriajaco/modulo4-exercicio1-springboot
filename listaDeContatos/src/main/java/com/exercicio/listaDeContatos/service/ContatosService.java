package com.exercicio.listaDeContatos.service;

import com.exercicio.listaDeContatos.model.ContatoModel;
import com.exercicio.listaDeContatos.repository.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContatosService {

    @Autowired
    private ContatosRepository contatosRepository;

    public List<ContatoModel> mostrarTodosContatos(){
        return contatosRepository.findAll();
    }

    public Optional<ContatoModel>buscarId (Long codigo){
        return contatosRepository.findById(codigo);
    }

    public ContatoModel cadastrar(ContatoModel contatoModel){
        return contatosRepository.save(contatoModel);
    }

    public ContatoModel updateContato(ContatoModel contatos) {

        return contatosRepository.save(contatos);
    }

    public void deletarContato(Long codigo){
        contatosRepository.deleteById(codigo);
    }
}
