package pjAula4;

public class Teste {
	public static void main(String[] args) {
		Cliente novo = new Cliente();
		
		System.out.println(novo.getCodigo());
		System.out.println(novo.getNome());
		System.out.println(novo.getFaturamento());
		System.out.println(novo.getSituacao());
		
		Cliente voce = new Cliente(1, "Jaqueline", 10_546.87f,
				SituacaoCadastral.ATIVO);
		
		System.out.println(voce.getCodigo());
		System.out.println(voce.getNome());
		System.out.println(voce.getFaturamento());
		System.out.println(voce.getSituacao());
	}
}
