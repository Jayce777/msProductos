package com.uisrael.ms_productosMDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.ms_productosMDB.model.TipoProducto;

public interface ITipoProductoRepository extends MongoRepository<TipoProducto, String> {

}
