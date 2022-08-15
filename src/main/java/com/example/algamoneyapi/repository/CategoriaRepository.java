package com.example.algamoneyapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

//import com.example.algamoney.api.model.Categoria;
  import com.example.algamoneyapi.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
