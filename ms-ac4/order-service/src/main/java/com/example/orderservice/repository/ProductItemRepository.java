package com.example.orderservice.repository;


import com.example.orderservice.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
@RepositoryRestResource
public interface ProductItemRepository extends JpaRepository<ProductItem, Long> {
}