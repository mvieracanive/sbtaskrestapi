package com.example.etecsa.services;

import java.util.List;

import com.example.etecsa.entities.Contrato;

public interface IContratoService {
    public Contrato salvar(Contrato obj);

    public List<Contrato> listar();

    public void eliminarPorId(Long id);

    public Contrato buscarPorId(Long id);

    // public List<Factura> findByDuracionLessThan(int duracion);
}