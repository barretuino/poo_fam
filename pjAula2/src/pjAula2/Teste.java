package pjAula2;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		int resultado = (5 + 4 + 72) % 7;
		
		System.out.println("Resultado é " + resultado);
		
		for(int i=51; i<=176; i++) {
			System.out.println(i);
		}
		
		Cliente agenda[] = new Cliente[50];
		Scanner digita = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			Cliente cadastro = new Cliente();
			System.out.println("Informe o código ");
			cadastro.setCodigo(digita.nextInt());
			System.out.println("Informe o nome ");
			cadastro.setNome(digita.next());
			
			agenda[i] = cadastro;
		}
		
		for(int i=0; i<3; i++) {
			System.out.println("Codigo " + agenda[i].getCodigo());
			System.out.println("Nome " + agenda[i].getNome());
		}
	}
}
