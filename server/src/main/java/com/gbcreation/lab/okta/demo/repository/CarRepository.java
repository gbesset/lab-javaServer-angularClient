package com.gbcreation.lab.okta.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gbcreation.lab.okta.demo.model.Car;


@RepositoryRestResource
public interface  CarRepository extends JpaRepository<Car, Long> {
}
