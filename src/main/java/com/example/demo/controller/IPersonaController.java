package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.Persona;

public interface IPersonaController {

	@RequestMapping(value = "/persona", method = RequestMethod.POST)
    ResponseEntity<Persona> alta(@RequestBody Persona body);
	
	@RequestMapping(value = "/persona", method = RequestMethod.PUT)
    ResponseEntity<Persona> modificacion(@RequestBody Persona body);
	
	@RequestMapping(value = "/persona", method = RequestMethod.DELETE)
    ResponseEntity<Persona> baja(@RequestBody Persona body);
	
}
