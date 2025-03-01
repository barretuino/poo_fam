package pjAula3;

/**
 * Classe de Modelagem Conceitual de Produto
 * Prof Paulo Barreto
 * 20/02/2025
 */
public class Produto {
	//Atributos
	private int codigo;
	private String descricao;
	private float quantidade;
	private float valorUnitario;
	private boolean status;
	
	//Métodos Construtores
	public Produto() {
	}
	public Produto(int codigo, String descricao, float quantidade,
			float valorUnitario, boolean status) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valorUnitario = valorUnitario;
		this.status = status;
	}
	//Getters e Setters
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(float quantidade) {
		this.quantidade = quantidade;
	}
	public float getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
