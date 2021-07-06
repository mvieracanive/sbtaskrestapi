package com.example.etecsa.services;

import org.springframework.stereotype.Service;

import java.util.List;

import com.example.etecsa.entities.Factura;
import com.example.etecsa.repositories.IFacturaRepo;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FacturaServiceImpl implements IFacturaService {

    @Autowired
    private IFacturaRepo repo;

    @Override
    public Factura salvar(Factura pelicula) {
        return repo.save(pelicula);
    }

    @Override
    public List<Factura> listar() {
        return repo.findAll();
    }

    @Override
    public List<Factura> listarContratoNull(List<Factura> fc) {
        List<Factura> nullf = repo.findByContratoNull();
        for (int i = 0; i < nullf.size(); i++) {
            Factura f = nullf.get(i);
            f.setFlag(false);
            nullf.set(i, f);
        }

        for (int i = 0; i < fc.size(); i++) {
            Factura f = fc.get(i);
            f.setFlag(true);
            fc.set(i, f);
        }

        nullf.addAll(fc);
        return nullf;
    }

    @Override
    public void eliminarPorId(Long id) {
        repo.deleteById(id);
    }

    @Override
    public Factura buscarPorId(Long id) {
        return repo.findById(id).get();
    }

}