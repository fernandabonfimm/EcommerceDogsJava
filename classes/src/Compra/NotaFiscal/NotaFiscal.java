package src.Compra.NotaFiscal;

import java.time.LocalDate;

public class NotaFiscal {
    private double valorFilhote;
    private double valorEntrega;
    private String formaEntrega;
    private LocalDate dataEntrega;
    private LocalDate dataCompra;
    private String nomeFilhote;
    private String nomeComprador;
    private String cpfComprador;
    
    public NotaFiscal(double valorFilhote, double valorEntrega, String formaEntrega, LocalDate dataEntrega, LocalDate dataCompra, String nomeFilhote, String nomeComprador, String cpfComprador) {
        this.valorFilhote = valorFilhote;
        this.valorEntrega = valorEntrega;
        this.formaEntrega = formaEntrega;
        this.dataEntrega = dataEntrega;
        this.dataCompra = dataCompra;
        this.nomeFilhote = nomeFilhote;
        this.nomeComprador = nomeComprador;
        this.cpfComprador = cpfComprador;
    }

    public double getValorFilhote() {
        return valorFilhote;
    }

    public void setValorFilhote(double valorFilhote) {
        this.valorFilhote = valorFilhote;
    }

    public double getValorEntrega() {
        return valorEntrega;
    }

    public void setValorEntrega(double valorEntrega) {
        this.valorEntrega = valorEntrega;
    }

    public String getFormaEntrega() {
        return formaEntrega;
    }

    public void setFormaEntrega(String formaEntrega) {
        this.formaEntrega = formaEntrega;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    public String getNomeFilhote() {
        return nomeFilhote;
    }

    public void setNomeFilhote(String nomeFilhote) {
        this.nomeFilhote = nomeFilhote;
    }

    public String getNomeComprador() {
        return nomeComprador;
    }

    public void setNomeComprador(String nomeComprador) {
        this.nomeComprador = nomeComprador;
    }

    public String getCpfComprador() {
        return cpfComprador;
    }

    public void setCpfComprador(String cpfComprador) {
        this.cpfComprador = cpfComprador;
    }
}
