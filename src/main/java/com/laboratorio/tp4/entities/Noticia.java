package com.laboratorio.tp4.entities;

import java.util.Date;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="noticias")
public class Noticia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;   
	
	@Column(name="titulo")
	private String tituloDeLaNoticia;  
	
	@Column(name="resumen")
	private String resumenDeLaNoticia; 
	
	@Column(name="imagen")
	private String imagenNoticia;    
	
	@Column(name="contenido_html")
	private String contenidoHTML;   
	
	@Column(name="publicada")
	private char publicada;
	
	@Column(name="fecha_publicacion")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaPublicación;  
	
	@ManyToOne(optional = false)
	@JoinColumn(name = "fk_empresa")
	public Empresa empresa;


	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTituloDeLaNoticia() {
		return tituloDeLaNoticia;
	}

	public void setTituloDeLaNoticia(String tituloDeLaNoticia) {
		this.tituloDeLaNoticia = tituloDeLaNoticia;
	}

	public String getResumenDeLaNoticia() {
		return resumenDeLaNoticia;
	}

	public void setResumenDeLaNoticia(String resumenDeLaNoticia) {
		this.resumenDeLaNoticia = resumenDeLaNoticia;
	}

	public String getImagenNoticia() {
		return imagenNoticia;
	}

	public void setImagenNoticia(String imagenNoticia) {
		this.imagenNoticia = imagenNoticia;
	}

	public String getContenidoHTML() {
		return contenidoHTML;
	}

	public void setContenidoHTML(String contenidoHTML) {
		this.contenidoHTML = contenidoHTML;
	}

	public char getPublicada() {
		return publicada;
	}

	public void setPublicada(char publicada) {
		this.publicada = publicada;
	}

	public Date getFechaPublicación() {
		return fechaPublicación;
	}

	public void setFechaPublicación(Date fechaPublicación) {
		this.fechaPublicación = fechaPublicación;
	}


	
}
