package com.example.entity;

import javax.persistence.Entity;


public class EmpleadosEntity {

	@Override
	public String toString() {
		return "EmpleadosEntity [empleado=" + empleado + ", edad=" + edad + ", sexo=" + sexo + ", telefono=" + telefono
				+ ", curp=" + curp + "]";
	}
	public String empleado;
	public int edad;
	public String sexo;
	public int telefono;
	public String curp;
	
	public String getEmpleado() {
		return empleado;
	}
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCurp() {
		return curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	
	
	
}
