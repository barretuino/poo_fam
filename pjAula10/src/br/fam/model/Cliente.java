package br.fam.model;

public class Cliente {
	//Atributos
	@Description (nome = "CPF")
	private double cpf;
	@Description (nome = "Nome")
	private String nome;
	@Description (nome = "Rua")
	private String endRua;
	@Description (nome = "Número")
	private int endNum;
	@Description (nome = "Bairro")
	private String endBairro;
	@Description (nome = "Cidade")
	private String endCidade;
	@Description (nome = "UF")
	private String endUF;
	@Description (nome = "Complemento")
	private String endComplemento;
	@Description (nome = "Sexo")
	private Sexo sexo;
	
	//Métodos
	public double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndRua() {
		return endRua;
	}
	public void setEndRua(String endRua) {
		this.endRua = endRua;
	}
	public int getEndNum() {
		return endNum;
	}
	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}
	public String getEndBairro() {
		return endBairro;
	}
	public void setEndBairro(String endBairro) {
		this.endBairro = endBairro;
	}
	public String getEndUF() {
		return endUF;
	}
	public void setEndUF(String endUF) {
		this.endUF = endUF;
	}
	public String getEndComplemento() {
		return endComplemento;
	}
	public void setEndComplemento(String endComplemento) {
		this.endComplemento = endComplemento;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public String getEndCidade() {
		return endCidade;
	}
	public void setEndCidade(String endCidade) {
		this.endCidade = endCidade;
	}
}

