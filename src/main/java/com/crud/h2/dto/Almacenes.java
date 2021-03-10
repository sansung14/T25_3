package com.crud.h2.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="almacenes")//en caso que la tabla sea diferente
public class Almacenes  {
 
	//Atributos de entidad almacen
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "lugar")//no hace falta si se llama igual
	private String lugar;
	@Column(name = "capacidad")//no hace falta si se llama igual
	private int capacidad;
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Cajas> caja;
	
	//Constructores
	
	public Almacenes() {
	
	}

	/**
	 * @param id
	 * @param lugar
	 * @param capacidad
	 * @param caja
	 */
	
	public Almacenes(Long id, String lugar, int capacidad, List<Cajas> caja) {
		super();
		this.id = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
		this.caja = caja;
	}


	/**
	 * @return the video
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
	public List<Cajas> getCaja() {
		return caja;
	}

	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public void setCaja(List<Cajas> caja) {
		this.caja = caja;
	}


	




	
	
	
	
	
	
}
