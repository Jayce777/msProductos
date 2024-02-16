package com.uisrael.ms_productosMDB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsProductosMdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsProductosMdbApplication.class, args);
	}

}
