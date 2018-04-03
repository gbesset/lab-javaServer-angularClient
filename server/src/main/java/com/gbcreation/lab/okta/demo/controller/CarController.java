package com.gbcreation.lab.okta.demo.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gbcreation.lab.okta.demo.model.Car;
import com.gbcreation.lab.okta.demo.repository.CarRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(path= "/api")
@Slf4j
public class CarController {

	@Resource
	 private CarRepository repository;
	 
	 /*public CarController(CarRepository repository) {
	        this.repository = repository;
	    }*/
	 
	 @RequestMapping(value="/count",method=RequestMethod.GET)
	 @CrossOrigin(origins = "http://localhost:4200")
	    public long countCars() {
		 	log.debug("Controller : count elemments");
	        return repository.count();
	    }
	 
	 @RequestMapping(value="/cars",method=RequestMethod.GET)
	 @CrossOrigin(origins = "http://localhost:4200")
	    public Collection<Car> cars() {
		 	log.debug("Controller : retrieve all elemments");
	        return repository.findAll().stream()
	                .collect(Collectors.toList());
	    }

	    
	 @RequestMapping(value="/cool-cars",method=RequestMethod.GET)
	 @CrossOrigin(origins = "http://localhost:4200")
	    public Collection<Car> coolCars() {
		 	log.debug("Controller : retrieve cool elemments");
	        return repository.findAll().stream()
	                .filter(this::isCool)
	                .collect(Collectors.toList());
	    }

	    private boolean isCool(Car car) {
	        return !car.getName().equals("AMC Gremlin") &&
	                !car.getName().equals("Triumph Stag") &&
	                !car.getName().equals("Ford Pinto") &&
	                !car.getName().equals("Yugo GV");
	    }
}
