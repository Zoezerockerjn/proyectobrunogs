package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.EmpleadosEntity;
import com.example.entity.GenericResponse;


@RestController
@RequestMapping("empleados")


public class EmpleadosControllers {
	EmpleadosControllers(){}
							
	@GetMapping(path = "lista")
	public GenericResponse lista() {
		GenericResponse response = new GenericResponse();
		EmpleadosEntity empleado = new EmpleadosEntity();
		
		try {
			empleado.setEmpleado("Bruno"); 
			empleado.setEdad(32);
			empleado.setSexo("masculino");
			empleado.setTelefono(5562566);
			empleado.setCurp(null);
			response.setCode(200);
			response.setData(empleado.edad);
			response.setMsg("Todo va bien");
			response.setSucess("success");
		} catch (Exception e) {
			response.setCode(400);
			response.setMsg("Algo fallo");
			response.setSucess("Error algo salio mal");
		}	
		return (response);
	}
	
	
}
