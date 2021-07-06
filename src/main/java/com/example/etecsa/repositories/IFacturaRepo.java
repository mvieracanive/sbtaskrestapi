package com.example.etecsa.repositories;

import java.util.List;

import com.example.etecsa.entities.Contrato;
import com.example.etecsa.entities.Factura;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFacturaRepo extends JpaRepository<Factura, Long> {
    public List<Factura> findByContratoNull();

    public List<Factura> findByContrato(Contrato c);
}