package com.uisrael.ms_productosMDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.ms_productosMDB.model.Producto;
import com.uisrael.ms_productosMDB.services.IProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

	@Autowired
	private IProductoService prodservice;
	
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public List<Producto> obtenerProdcutos(){
		return prodservice.obtenerProductos();
		
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.OK)
	public Producto insertarproducto(@RequestBody Producto nuevo) {
		//System.out.println("el nuevo prod: "+nuevo);
		prodservice.crearProducto(nuevo);
		return nuevo;
	}
}
