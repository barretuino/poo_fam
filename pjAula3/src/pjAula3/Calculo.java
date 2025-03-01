package pjAula3;

public class Calculo {
	public int somar(int a, int b) {
		return a + b;
	}
	public int somar(String a, int b) {
		return Integer.parseInt(a) + b;
	}
	public int somar(String a, String b) {
		return Integer.parseInt(a) + Integer.parseInt(b);
	}
	public int somar(int a, String b) {
		return a + Integer.parseInt(b);
	}
	public int somar(int a) {
		return a + a;
	}
	public int somar(int a, int b, float c) {
		return a + b + (int)c;
	}
}
