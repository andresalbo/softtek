package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private PersonaRepository repo;
	
	@Override
	public boolean add(Persona p) {
		return repo.insertPersona(p);
	}

	@Override
	public boolean remove(Persona p) {
		return repo.deletePersona(p);
	}

	@Override
	public boolean update(Persona p) {
		return repo.actualizarPersona(p);
	}

}
