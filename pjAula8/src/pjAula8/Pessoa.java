package pjAula8;

//Classe de Modelagem conceitual Superclass
public class Pessoa {
	private static int contador = 0;
	String nome;
	
	public Pessoa() {
		contador++;
	}
	
	public void metodo(int a) {
		System.out.println(
			this.getClass().getSimpleName());
	}
	
	static int getContador() {
		return contador;
	}
}
