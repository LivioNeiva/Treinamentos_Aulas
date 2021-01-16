package com.livioneiva.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livioneiva.domain.entities.Cliente;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {

	@GetMapping
	public ResponseEntity<Cliente> findAll(){
		
		Cliente c = new Cliente(1L, "Maria", "maria@gmail.com", "88888888", "123456");
		 return ResponseEntity.ok().body(c);
	}
	
}
