package com.idat.citaslimatambo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paciente")

public class Paciente {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	
	@Column(name="nombre")
	 private String nombre;
	
	@Column(name="apellido")
	 private String apellido;
	
		@Column(name="dni")
	 private String dni;
		
	@Column(name="direccion")
	 private String direccion;
	
	@Column(name="correo")
	 private String correo;
	
		@Column(name="telefono")
	 private String telefono;

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

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		
		

}
