package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IAlmacenesDAO;
import com.crud.h2.dto.Almacenes;

@Service
public class AlmacenServiceImpl implements IAlmacenService{
	
	//Utilizamos los metodos de la interface IAlmacenDAO, es como si instaciaramos.
	@Autowired
	IAlmacenesDAO iAlmacenDAO;
	
	@Override
	public List<Almacenes> listarAlmacenes() {
		
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacenes guardarAlmacen(Almacenes almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacenes almacenXID(Long id) {
		
		return iAlmacenDAO.findById(id).get();
	}

	@Override
	public Almacenes actualizarAlmacen(Almacenes almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long id) {
		
		iAlmacenDAO.deleteById(id);
		
	}

}
