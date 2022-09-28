package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.service.IPersonaService;

@RestController
public class PersonaController implements IPersonaController {

	@Autowired
	private IPersonaService service;
	
	@Override
	public ResponseEntity<Persona> alta(Persona body) {
		boolean response = service.add(body);
		if (response) return ResponseEntity.status(HttpStatus.CREATED).build();
		return ResponseEntity.internalServerError().build();
	}

	@Override
	public ResponseEntity<Persona> modificacion(Persona body) {
		boolean response = service.update(body);
		if (response) return ResponseEntity.ok().build();
		return ResponseEntity.internalServerError().build();
	}

	@Override
	public ResponseEntity<Persona> baja(Persona body) {
		boolean response = service.remove(body);
		if (response) return ResponseEntity.ok().build();
		return ResponseEntity.notFound().build();
	}

	
}
