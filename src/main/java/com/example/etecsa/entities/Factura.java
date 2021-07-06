package com.example.etecsa.entities;

import java.io.Serializable;
import javax.persistence.*;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Factura implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "id de la factura")
    private Long id;
    @ApiModelProperty(value = "no. de la factura")
    private String numero;
    @ApiModelProperty(value = "monto de la factura")
    private Float monto;

    @Transient
    private boolean flag;

    @ManyToOne
    @ApiModelProperty(value = "contrato de la factura")
    private Contrato contrato;

    public Factura() {
    }

    public Factura(String numero, Float monto) {
        this.numero = numero;
        this.monto = monto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public boolean getFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

}