package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Almacenes;

public interface IAlmacenService {

	//Metodos del CRUD
	public List<Almacenes> listarAlmacenes(); //Listar All 
	
	public Almacenes guardarAlmacen(Almacenes almacen);	//Guarda un almacen CREATE
	
	public Almacenes almacenXID(Long id); //Leer datos de un almacen READ
	
	public Almacenes actualizarAlmacen(Almacenes almacen); //Actualiza datos del almacen UPDATE
	
	public void eliminarAlmacen(Long id);// Elimina el almacen DELETE
	
	
}
