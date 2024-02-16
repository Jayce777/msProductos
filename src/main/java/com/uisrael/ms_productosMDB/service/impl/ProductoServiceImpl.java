package com.uisrael.ms_productosMDB.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.ms_productosMDB.model.Producto;
import com.uisrael.ms_productosMDB.repository.IProductoRepository;
import com.uisrael.ms_productosMDB.services.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository repo;
	@Override
	public List<Producto> obtenerProductos() {

		return repo.findAll();
	}

	@Override
	public boolean crearProducto(Producto nuevo) {
		// TODO Auto-generated method stub
		try {
			repo.save(nuevo);
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
