package com.uisrael.ms_productosMDB.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uisrael.ms_productosMDB.model.TipoProducto;
import com.uisrael.ms_productosMDB.repository.ITipoProductoRepository;
import com.uisrael.ms_productosMDB.services.ITipoProductoService;

@Service
public class TipoProductoServiceImpl implements ITipoProductoService {

	@Autowired
	private ITipoProductoRepository repo;
	
	@Override
	public boolean crearTipo(TipoProducto nuevo) {
		
		try {
			repo.save(nuevo);
			return true;
		} catch (Exception e) {
			System.out.println("No se pudo agregar el registro");
		}
		return false;
	}

	@Override
	public List<TipoProducto> otenerTipo() {
		return repo.findAll();
	}

}
