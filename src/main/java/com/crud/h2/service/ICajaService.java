package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Cajas;

public interface ICajaService {

	//Metodos del CRUD
		public List<Cajas> listarCajas(); //Listar All 
		
		public Cajas guardarCaja(Cajas caja);	//Guarda un caja CREATE
		
		public Cajas cajaXID(String id); //Leer datos de un caja READ
		
		public Cajas actualizarCaja(Cajas caja); //Actualiza datos del caja UPDATE
		
		public void eliminarCaja(String id);// Elimina el caja DELETE
}
