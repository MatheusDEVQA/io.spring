package com.projectspringrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping
    public String ListarClientes(){
      return "Clientes...";
    }
}
