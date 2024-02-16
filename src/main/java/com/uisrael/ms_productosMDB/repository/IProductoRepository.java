package com.uisrael.ms_productosMDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.ms_productosMDB.model.Producto;

public interface IProductoRepository extends MongoRepository<Producto, String> {

}
