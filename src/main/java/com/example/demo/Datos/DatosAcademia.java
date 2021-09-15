package com.example.demo.Datos;


//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
//define una identidad en este caso la tabla a la cuel se hará coonexión
@Entity
// el nombre de la tabla de la cual se extraeran la información 
@Table(name="certificado_u_policial")
public class DatosAcademia {
	//define el id de la identidad 
	@Id
	//define un id creando un malor automaticamente incremental
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    
	//variables en las que se guardará la informacion de base de datos a su vez con el nombre de las tablas referenciadas
	private Integer id_certificado;
	private String ncontrol;
	private String cup;
	
	//contructor por defecto
	public DatosAcademia() {
	}
	
	//contructor con los datos de la clase 
	public DatosAcademia(String ncontrol, String cup, Integer id_certificado) {
		super();
		this.id_certificado  =id_certificado;
		this.ncontrol = ncontrol;
		this.cup = cup;
	}


	//metodos set y get para devolver los datos obtenidos
	public Integer getId_certificado() {
		return id_certificado;
	}
	
	public String getNcontrol() {
		return ncontrol;
	}
	public String getCup() {
		return cup;
	}
	
	/*
	public void setncontrol(String ncontrol) {
		this.ncontrol = ncontrol;
	}

	public void setCup(String cup) {
		this.cup = cup;
	}
	*/
	
}
