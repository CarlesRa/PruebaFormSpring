package com.carlesramos.spring.services;

import java.util.List;

import javax.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.stereotype.Service;

import com.carlesramos.spring.model.Empleado;

@Service
public class EmpleadoService {


	public List<Empleado> repository = new ArrayList<>();
	
	public Empleado add(Empleado e) {
		repository.add(e);
		return e;
	}
	
	public List<Empleado> findAll() {
		return repository;
	}
	
	@PostConstruct
	public void init() {
		repository.addAll(
				Arrays.asList(new Empleado(1, "Antonio Garcia", "agarcia@gmail.com","680998240"),
						new Empleado(2, "Manolo Estepona", "mEstepona@gmail.com","690999888"),
						new Empleado(3, "Maria Gonzalez", "mGonzalez@gmail.com", "654432432"))
				);
	}
	

}
