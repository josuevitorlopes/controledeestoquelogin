package com.projetopoobackend.sistemadeestoque.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.projetopoobackend.sistemadeestoque.domain.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, String> {

    void save(List<Product> list);

    Optional<Product> findById(String id);

}
