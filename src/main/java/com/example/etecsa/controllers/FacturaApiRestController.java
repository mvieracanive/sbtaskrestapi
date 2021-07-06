package com.example.etecsa.controllers;

import com.example.etecsa.entities.Factura;
import com.example.etecsa.services.IFacturaService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/factura")
public class FacturaApiRestController {
    @Autowired
    private IFacturaService service;

    @PostMapping
    @ApiOperation(httpMethod = "POST", value = "adicionar recurso", notes = "Retorna un recurso Factura")
    public Factura add(@RequestBody Factura obj) {
        return service.salvar(obj);
    }

    @GetMapping("/{id}")
    @ApiOperation(httpMethod = "GET", value = "leer recurso por id", notes = "Retorna un recurso Factura dado el id")
    public Factura read(@PathVariable(name = "id") Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping
    @ApiOperation(httpMethod = "PUT", value = "actualizar recurso", notes = "Actualiza y retorna un recurso Factura")
    public Factura update(@RequestBody Factura factura) {
        return service.salvar(factura);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(httpMethod = "DELETE", value = "eliminar recurso por id", notes = "Elimina un recurso Factura dado el id")
    public void delete(@PathVariable(name = "id") Long id) {
        service.eliminarPorId(id);
    }

    @GetMapping
    @ApiOperation(httpMethod = "GET", value = "leer todos los recurso", notes = "Retorna todos los recursos Factura")
    public List<Factura> findAll() {
        return service.listar();
    }
}
