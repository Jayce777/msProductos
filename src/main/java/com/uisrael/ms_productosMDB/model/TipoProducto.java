package com.uisrael.ms_productosMDB.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "TipoProductos")
@Getter
@Setter
@NoArgsConstructor
public class TipoProducto {

	@Id
	private String idTipo;
	private String nombreTipo;
	private boolean estado;
	
	 @DBRef
	private List<Producto> productos;
	
}
