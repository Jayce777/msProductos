package com.uisrael.ms_productosMDB.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "Productos")
@Getter
@Setter
@NoArgsConstructor
public class Producto {

	@Id
	private String idProducto;
	private String nombre;
	private String descripcion;
	private double precio;
	private boolean estado;
	
	@DBRef
	private TipoProducto tipoProducto;
	 
}
