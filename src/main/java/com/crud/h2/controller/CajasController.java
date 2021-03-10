package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Cajas;
import com.crud.h2.service.CajaServiceImpl;

@RestController
@RequestMapping("/api")
public class CajasController {

	@Autowired
	CajaServiceImpl cajaServideImpl;
	
	@GetMapping("/cajas")
	public List<Cajas> listarCajas(){
		return cajaServideImpl.listarCajas();
	}
	
	@PostMapping("/cajas")
	public Cajas salvarCaja(@RequestBody Cajas caja) {
		
		return cajaServideImpl.guardarCaja(caja);
	}
	
	@GetMapping("/cajas/{numreferencia}")
	public Cajas cajaXID(@PathVariable(name="numreferencia") String numreferencia) {
		
		Cajas caja_xid= new Cajas();
		
		caja_xid=cajaServideImpl.cajaXID(numreferencia);
		
		//System.out.println("Caja XID: "+caja_xid);
		
		return caja_xid;
	}
	
	@PutMapping("/cajas/{numreferencia}")
	public Cajas actualizarCaja(@PathVariable(name="numreferencia")String numreferencia,@RequestBody Cajas caja) {
		
		Cajas caja_seleccionado= new Cajas();
		Cajas caja_actualizado= new Cajas();
		
		caja_seleccionado= cajaServideImpl.cajaXID(numreferencia);

		caja_seleccionado.setContenido(caja.getContenido());
		caja_seleccionado.setValor(caja.getValor());
		caja_seleccionado.setAlmacen(caja.getAlmacen());
		
		caja_actualizado = cajaServideImpl.actualizarCaja(caja_seleccionado);
		
		//System.out.println("El caja actualizado es: "+ caja_actualizado);
		
		return caja_actualizado;
	}
	
	@DeleteMapping("/cajas/{numreferencia}")
	public void eliminarCaja(@PathVariable(name="numreferencia")String numreferencia) {
		cajaServideImpl.eliminarCaja(numreferencia);
	}
	
}
