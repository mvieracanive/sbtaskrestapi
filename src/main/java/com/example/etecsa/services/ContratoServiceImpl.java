package com.example.etecsa.services;

import org.springframework.stereotype.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.etecsa.entities.Contrato;
import com.example.etecsa.repositories.IContratoRepo;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class ContratoServiceImpl implements IContratoService {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private IContratoRepo repo;

    @Override
    public Contrato salvar(Contrato obj) {
        // entityManager.persist(obj);
        return repo.save(obj);
    }

    @Override
    public List<Contrato> listar() {
        return repo.findAll();
    }

    @Override
    public void eliminarPorId(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Contrato buscarPorId(Long id) {
        return repo.findById(id).get();
    }

}