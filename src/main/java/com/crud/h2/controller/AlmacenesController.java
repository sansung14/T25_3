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

import com.crud.h2.dto.Almacenes;
import com.crud.h2.service.AlmacenServiceImpl;

@RestController
@RequestMapping("/api")
public class AlmacenesController {
	
	@Autowired
	AlmacenServiceImpl almacenServideImpl;
	
	@GetMapping("/almacenes")
	public List<Almacenes> listarAlmacenes(){
		return almacenServideImpl.listarAlmacenes();
	}
	
	@PostMapping("/almacenes")
	public Almacenes salvarAlmacen(@RequestBody Almacenes almacen) {
		
		return almacenServideImpl.guardarAlmacen(almacen);
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacenes almacenXID(@PathVariable(name="id") Long id) {
		
		Almacenes almacen_xid= new Almacenes();
		
		almacen_xid=almacenServideImpl.almacenXID(id);
		
		//System.out.println("Almacen XID: "+almacen_xid);
		
		return almacen_xid;
	}
	
	@PutMapping("/almacenes/{id}")
	public Almacenes actualizarAlmacen(@PathVariable(name="id")Long id,@RequestBody Almacenes almacen) {
		
		Almacenes almacen_seleccionado= new Almacenes();
		Almacenes almacen_actualizado= new Almacenes();
		
		almacen_seleccionado= almacenServideImpl.almacenXID(id);
		
		almacen_seleccionado.setLugar(almacen.getLugar());
		almacen_seleccionado.setCapacidad(almacen.getCapacidad());

		almacen_actualizado = almacenServideImpl.actualizarAlmacen(almacen_seleccionado);
		
		//System.out.println("El almacen actualizado es: "+ almacen_actualizado);
		
		return almacen_actualizado;
	}
	
	@DeleteMapping("/almacenes/{id}")
	public void eleiminarAlmacen(@PathVariable(name="id")Long id) {
		almacenServideImpl.eliminarAlmacen(id);
	}
	
	
}
