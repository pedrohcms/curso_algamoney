package com.algaworks.algamoney_api.algamoney_api.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.algaworks.algamoney_api.algamoney_api.model.Categoria;
import com.algaworks.algamoney_api.algamoney_api.repository.CategoriaRepository;

@RestController
@RequestMapping("/categorias") // Faz o mapeamento da requisição
public class CategoriaResource {

    @Autowired //Injetando a implemetação de CategoriaRepository
    private CategoriaRepository categoriaRepository;

    @GetMapping //Mapeamento do get para a URL categorias
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }
    
}