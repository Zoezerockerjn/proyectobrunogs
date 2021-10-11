package com.formacionbdi.microservicios.app.usuarios.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table( name= "alumnos")
public class Alumno {
	
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;

	private String nombre;
	private String apellido;
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name = "create_at")
	private Date createAt;
	
	@PrePersist
	private void prePersist() {
		this.createAt = new Date();
	}
	
	
	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	
}
