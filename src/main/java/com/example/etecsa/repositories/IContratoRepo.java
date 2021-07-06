package com.example.etecsa.repositories;

import com.example.etecsa.entities.Contrato;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IContratoRepo extends JpaRepository<Contrato, Long> {
    // public List<Factura> findByDuracionLessThan(int duracion);
}