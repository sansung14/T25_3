package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.ICajasDAO;
import com.crud.h2.dto.Cajas;

@Service
public class CajaServiceImpl implements ICajaService{

	@Autowired
	ICajasDAO iCajaDAO;
	
	@Override
	public List<Cajas> listarCajas() {
		
		return iCajaDAO.findAll();
	}
	
	@Override
	public Cajas guardarCaja(Cajas caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public Cajas cajaXID(String id) {
		
		return iCajaDAO.findById(id).get();
	}

	@Override
	public Cajas actualizarCaja(Cajas caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String id) {
		
		iCajaDAO.deleteById(id);
		
	}
}
