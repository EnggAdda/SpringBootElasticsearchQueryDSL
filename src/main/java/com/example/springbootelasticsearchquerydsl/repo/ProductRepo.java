package com.example.springbootelasticsearchquerydsl.repo;


import com.example.springbootelasticsearchquerydsl.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {



        }
