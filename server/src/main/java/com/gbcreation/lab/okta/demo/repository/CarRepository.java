package com.gbcreation.lab.okta.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.gbcreation.lab.okta.demo.model.Car;


@RepositoryRestResource
@CrossOrigin(origins = {"http://localhost:4200", "http://lab-car.gbcreation.fr"})
public interface  CarRepository extends JpaRepository<Car, Long> {
}
