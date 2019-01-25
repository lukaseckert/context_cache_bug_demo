package com.example.com.example.demo.repository;

import com.example.com.example.demo.model.PersonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FooBarRepository extends JpaRepository<PersonModel, Integer> {


}
