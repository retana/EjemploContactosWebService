package org.retana.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contacto")
public class Contacto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idContacto;
	@Column
	private String nombre;
	@Column
	private String telefono;
	@Column
	private String direccion;
	@Column
	private String correo;
	public Integer getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(Integer idContacto) {
		this.idContacto = idContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	public Contacto(Integer idContacto, String nombre, String telefono, String direccion, String correo) {
		super();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}
	public Contacto() {
		super();
		// TODO Auto-generated constructor stub
	}
		
}
