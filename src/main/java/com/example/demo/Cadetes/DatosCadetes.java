package com.example.demo.Cadetes;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadete")
public class DatosCadetes {
	
	@Id
	private Integer idcadete;
	private String  f_llenado, tipo_ingreso, folio, a_paterno, a_materno, nombre, f_nacimiento;
	
	
	public DatosCadetes() {
	}
	
	public DatosCadetes(Integer idcadete ,String f_llenado, String tipo_ingreso, String folio, String a_paterno, String a_materno,
			String nombre, String f_nacimiento) {
		super();
		this.idcadete = idcadete;
		this.f_llenado = f_llenado;
		this.tipo_ingreso = tipo_ingreso;
		this.folio = folio;
		this.a_paterno = a_paterno;
		this.a_materno = a_materno;
		this.nombre = nombre;
		this.f_nacimiento = f_nacimiento;
	}

	
	public Integer getIdCadete() {
		return idcadete;
	}

	public void setIdCadete(Integer idcadete) {
		this.idcadete = idcadete;
	}

	public String setf_llenado(){
		return f_llenado;
	}
	
	public void getf_llenado(String f_llenado){
		this.f_llenado = f_llenado;
	}

	public String getf_llenado() {
		return f_llenado;
	}

	public void setf_llenado(String f_llenado) {
		this.f_llenado = f_llenado;
	}

	public String getTipo_ingreso() {
		return tipo_ingreso;
	}

	public void setTipo_ingreso(String tipo_ingreso) {
		this.tipo_ingreso = tipo_ingreso;
	}

	public String getFolio() {
		return folio;
	}

	public void setFolio(String folio) {
		this.folio = folio;
	}

	public String getA_paterno() {
		return a_paterno;
	}

	public void setA_paterno(String a_paterno) {
		this.a_paterno = a_paterno;
	}

	public String getA_materno() {
		return a_materno;
	}

	public void setA_materno(String a_materno) {
		this.a_materno = a_materno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getF_nacimiento() {
		return f_nacimiento;
	}

	public void setF_nacimiento(String f_nacimiento) {
		this.f_nacimiento = f_nacimiento;
	}

	
}
