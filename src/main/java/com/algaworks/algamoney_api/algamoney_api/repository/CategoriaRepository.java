package com.algaworks.algamoney_api.algamoney_api.repository;

import com.algaworks.algamoney_api.algamoney_api.model.Categoria;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}