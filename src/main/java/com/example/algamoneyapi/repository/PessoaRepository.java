package com.example.algamoneyapi.repository;


import com.example.algamoneyapi.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
