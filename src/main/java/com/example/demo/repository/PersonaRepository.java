package com.example.demo.repository;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

@Repository
public class PersonaRepository {

	private static Set<Persona> memoria = new HashSet<>();

	public boolean insertPersona(Persona p) {
		return memoria.add(p);
	}

	public boolean deletePersona(Persona p) {
		return memoria.remove(p);
	}

	public boolean actualizarPersona(Persona p) {
		Persona persona = memoria.stream().filter(per -> per.getDni().equals(p.getDni())).findFirst().orElse(null);
		if (persona != null) {
			persona.setApellido(p.getApellido());
			persona.setNombre(p.getNombre());
			persona.setDni(p.getDni());
			persona.setEmpleado(p.getEmpleado());
			return true;
		}
		return false;
	}
}
