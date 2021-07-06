package com.example.etecsa.services;

import java.util.List;

import com.example.etecsa.entities.Factura;

public interface IFacturaService {
    public Factura salvar(Factura pelicula);

    public List<Factura> listar();

    public void eliminarPorId(Long id);

    public Factura buscarPorId(Long id);

    public List<Factura> listarContratoNull(List<Factura> fc);

    // public List<Factura> findByDuracionLessThan(int duracion);
}