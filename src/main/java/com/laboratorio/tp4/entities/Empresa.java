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
private String denominación;

@Column(name="telefono")
private String teléfono;

@Column(name="horario_atencion")
private String horarioDeAtención; 

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
public String getDenominación() {
	return denominación;
}
public void setDenominación(String denominación) {
	this.denominación = denominación;
}
public String getTeléfono() {
	return teléfono;
}
public void setTeléfono(String teléfono) {
	this.teléfono = teléfono;
}
public String getHorarioDeAtención() {
	return horarioDeAtención;
}
public void setHorarioDeAtención(String horarioDeAtención) {
	this.horarioDeAtención = horarioDeAtención;
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
