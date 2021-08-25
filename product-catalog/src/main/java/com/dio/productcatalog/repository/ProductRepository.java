package com.dio.productcatalog.repository;

import com.dio.productcatalog.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
