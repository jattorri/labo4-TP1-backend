package com.laboratorio.tp4.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empresas")
public class Empresa {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(name="denominacion")
private String denominacion;

@Column(name="telefono")
private String telefono;

@Column(name="horario_atencion")
private String horarioDeAtencion; 

@Column(name="quienes_somos")
private String quienesSomos;

@Column(name="latitud")
private Double latitud;

@Column(name="longitud")
private Double longitud;  

@Column(name="domicilio")
private String domicilio;    

@Column(name="email")
private String email;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getDenominacion() {
	return denominacion;
}
public void setDenominación(String denominacion) {
	this.denominacion = denominacion;
}
public String getTelefono() {
	return telefono;
}
public void setTeléfono(String telefono) {
	this.telefono = telefono;
}
public String getHorarioDeAtencion() {
	return horarioDeAtencion;
}
public void setHorarioDeAtención(String horarioDeAtencion) {
	this.horarioDeAtencion = horarioDeAtencion;
}
public String getQuienesSomos() {
	return quienesSomos;
}
public void setQuienesSomos(String quienesSomos) {
	this.quienesSomos = quienesSomos;
}
public Double getLatitud() {
	return latitud;
}
public void setLatitud(Double latitud) {
	this.latitud = latitud;
}
public Double getLongitud() {
	return longitud;
}
public void setLongitud(Double longitud) {
	this.longitud = longitud;
}
public String getDomicilio() {
	return domicilio;
}
public void setDomicilio(String domicilio) {
	this.domicilio = domicilio;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}    


}
