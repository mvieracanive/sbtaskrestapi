package com.example.etecsa.controllers;

import com.example.etecsa.entities.IP;
import com.example.etecsa.services.IIPService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/ip")
@Api(tags = "Servicio de instrumento de pago")
public class IPApiRestController {
    @Autowired
    private IIPService service;

    @GetMapping("/{contractId}")
    @ApiOperation(httpMethod = "GET", value = "genera instrumento de pago por id de contrato", notes = "Retorna un recurso IP dado el id de contrato")
    public IP read(@PathVariable(name = "contractId") Long id) {
        return service.generateIP(id);
    }
}
