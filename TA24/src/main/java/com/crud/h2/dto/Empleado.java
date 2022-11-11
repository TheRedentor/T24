package com.crud.h2.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="empleado")//en caso que la tabala sea diferente
public class Empleado {

	//Atributos de entidad cliente
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "trabajo")//no hace falta si se llama igual
	private String trabajo;
	@Column(name = "salario")//no hace falta si se llama igual
	private int salario;
	
	private enum Trabajo {
		TRABAJO_1,
		TRABAJO_2,
		TRABAJO_3;
	}
	
	
	//Constructores
	
	public Empleado() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 */
	public Empleado(Long id, String nombre, String trabajo, int salario) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo = nombre;
		this.salario = changeSalario(this.trabajo);
	}

	
	//Getters y Setters
	
	/**
	 * @return id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return trabajo
	 */
	public String getTrabajo() {
		return trabajo;
	}

	/**
	 * @param trabajo
	 */
	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	/**
	 * @return salario
	 */
	public int getSalario() {
		return changeSalario(this.trabajo);
	}

	/**
	 * @param salario
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario + "]";
	}
	
	
	public int changeSalario(String trabajo) {
		int salario = 0;
		if (trabajo.equals("Trabajo 1")) {
			salario = 1200;
		}
		else if (trabajo.equals("Trabajo 2")) {
			salario = 1400;
		}
		else if (trabajo.equals("Trabajo 3")) {
			salario = 1100;
		}
		return salario;
	}
	
}
