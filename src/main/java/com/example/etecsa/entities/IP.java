package com.example.etecsa.entities;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class IP {
    @ApiModelProperty(value = "monto del instrumento de pago")
    private Float amount;
    @ApiModelProperty(value = "beneficiario del instrumento de pago")
    private String beneficiario;
    @ApiModelProperty(value = "banco del instrumento de pago")
    private String bank;
    @ApiModelProperty(value = "cuenta del instrumento de pago")
    private String account;
    /*
     * @ApiModelProperty(value = "facturas del instrumento de pago") private
     * List<Factura> facturas;
     */
    @ApiModelProperty(value = "contrato del instrumento de pago")
    private String contract;

    public IP() {

    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getBeneficiario() {
        return beneficiario;
    }

    public void setBeneficiario(String beneficiario) {
        this.beneficiario = beneficiario;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    /*
     * public List<Factura> getFacturas() { return facturas; }
     * 
     * public void setFacturas(List<Factura> facturas) { this.facturas = facturas; }
     */

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
    }
}
