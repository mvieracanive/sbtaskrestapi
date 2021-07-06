package com.example.etecsa.controllers;

import com.example.etecsa.entities.Contrato;
import com.example.etecsa.services.IContratoService;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/contrato")
@Api(tags = "Servicio de Contrato")
public class ContratoApiRestController {

    @Autowired
    private IContratoService service;

    @PostMapping
    @ApiOperation(httpMethod = "POST", value = "adicionar recurso", notes = "Retorna un recurso Contrato")
    public Contrato add(@RequestBody Contrato obj) {
        return service.salvar(obj);
    }

    @GetMapping("/{id}")
    @ApiOperation(httpMethod = "GET", value = "leer recurso por id", notes = "Retorna un recurso Contrato dado el id")
    public Contrato read(@PathVariable(name = "id") Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping
    @ApiOperation(httpMethod = "PUT", value = "actualizar recurso", notes = "Actualiza y retorna un recurso Contrato")
    public Contrato update(@RequestBody Contrato contrato) {
        return service.salvar(contrato);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(httpMethod = "DELETE", value = "eliminar recurso por id", notes = "Elimina un recurso Contrato dado el id")
    public void delete(@PathVariable(name = "id") Long id) {
        service.eliminarPorId(id);
    }

    @GetMapping
    @ApiOperation(httpMethod = "GET", value = "leer todos los recurso", notes = "Retorna todos los recursos Contrato")
    public List<Contrato> findAll() {
        return service.listar();
    }
}