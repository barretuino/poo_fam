package br.fam.modelagem;

public class Empresa {

    private int id;
    private String descricao;
    private double faturamento;

    public Empresa() {
    }

    public Empresa(int id, String descricao, double faturamento) {
        this.id = id;
        this.descricao = descricao;
        this.faturamento = faturamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

}
