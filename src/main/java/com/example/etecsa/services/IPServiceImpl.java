package com.example.etecsa.services;

import java.util.List;

import com.example.etecsa.entities.Contrato;
import com.example.etecsa.entities.Factura;
import com.example.etecsa.entities.IP;
import com.example.etecsa.repositories.IContratoRepo;
import com.example.etecsa.repositories.IFacturaRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IPServiceImpl implements IIPService {
    @Autowired
    private IContratoRepo repo;

    @Autowired
    private IFacturaRepo repof;

    public IP generateIP(Long contract_id) {
        Contrato c = this.repo.findById(contract_id).get();
        List<Factura> fs = c.getFacturas();// this.repof.findByContrato(c);

        Float amount = new Float(0);
        for (int i = 0; i < fs.size(); i++) {
            Factura f = fs.get(i);
            amount += f.getMonto();
        }

        IP ip = new IP();

        ip.setAmount(amount);
        ip.setBank(c.getBanco());
        ip.setBeneficiario(c.getBeneficiario());
        ip.setContract(c.getNumero());
        // ip.setFacturas(fs);

        return ip;
    }
}
