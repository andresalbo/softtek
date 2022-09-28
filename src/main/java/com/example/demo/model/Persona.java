package com.example.demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Persona {
	
	private String nombre;
	private String apellido;
	private Long dni;
	private String empleado;

}
