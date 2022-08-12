package com.exercicio.listaDeContatos.repository;

import com.exercicio.listaDeContatos.model.ContatoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContatosRepository extends JpaRepository<ContatoModel, Long> {



}
