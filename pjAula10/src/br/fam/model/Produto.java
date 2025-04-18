package br.fam.model;

/** Classe de Modelagem Conceitual
 * Data 17/04/2025
 */
@CRUDName (nome = "Cadastro de Produto", insert = true, search = true)
public class Produto {
	//Atributos
	@Description (nome = "Código", tamanho = 2)
	private int codigo;
	
	@Description (nome = "Descrição")
	private String descricao;
	
	@Description (nome = "Unid. Medida")
	private UnidadeMedida un;
	
	@Description (nome = "Largura")
	private float largura;
	
	@Description (nome = "Comprimento")
	private float comprimento;
	
	@Description (nome = "Situação")
	private Situacao situacao;
	
	@Description (nome = "Localização")
	private String localizacao;

	//Métodos
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
	public UnidadeMedida getUn() {
		return un;
	}
	public void setUn(UnidadeMedida un) {
		this.un = un;
	}
	public float getLargura() {
		return largura;
	}
	public void setLargura(float largura) {
		this.largura = largura;
	}
	public float getComprimento() {
		return comprimento;
	}
	public void setComprimento(float comprimento) {
		this.comprimento = comprimento;
	}
	public Situacao getSituacao() {
		return situacao;
	}
	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}	
}
