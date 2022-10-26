package com.educandoweb.ProjetoWebServicesJpaHibernate.service;

import com.educandoweb.ProjetoWebServicesJpaHibernate.entities.User;
import com.educandoweb.ProjetoWebServicesJpaHibernate.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
