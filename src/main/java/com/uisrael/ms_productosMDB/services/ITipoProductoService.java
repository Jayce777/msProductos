package com.uisrael.ms_productosMDB.services;

import java.util.List;

import com.uisrael.ms_productosMDB.model.TipoProducto;

public interface ITipoProductoService {

	public boolean crearTipo(TipoProducto nuevo);
	
	public List<TipoProducto> otenerTipo();

}
