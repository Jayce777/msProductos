package com.uisrael.ms_productosMDB.services;

import java.util.List;

import com.uisrael.ms_productosMDB.model.Producto;

public interface IProductoService {

	public List<Producto> obtenerProductos();
	
	public boolean crearProducto(Producto nuevo);
}
