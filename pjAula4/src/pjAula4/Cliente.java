package pjAula4;

public class Cliente {
	//Atributos
	private int codigo;
	private String nome;
	private float faturamento;
	private SituacaoCadastral situacao;

	//Métodos Construtores
	public Cliente() {
		situacao = SituacaoCadastral.ATIVO;
	}
	public Cliente(int codigo, String nome, float faturamento, 
			SituacaoCadastral situacao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.faturamento = faturamento;
		this.situacao = situacao;
	}	
	
	//Metodos Getters and Setters (CTRL + 3 --> ggas)
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getFaturamento() {
		return faturamento;
	}
	public void setFaturamento(float faturamento) {
		this.faturamento = faturamento;
	}
	public SituacaoCadastral getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoCadastral situacao) {
		this.situacao = situacao;
	}
}