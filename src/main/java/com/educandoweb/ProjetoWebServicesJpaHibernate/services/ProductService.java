package com.educandoweb.ProjetoWebServicesJpaHibernate.services;


import com.educandoweb.ProjetoWebServicesJpaHibernate.entities.Product;
import com.educandoweb.ProjetoWebServicesJpaHibernate.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> findAll() {
        return repo.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = repo.findById(id);
        return obj.get();
    }
}
