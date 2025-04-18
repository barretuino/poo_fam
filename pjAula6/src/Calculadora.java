public class Calculadora {
	public static void mostrarCalculo(OperacaoMatematica op,
			double x, double y) {
		System.out.println("Operacao Realizada "
				+ op.getClass().getSimpleName()
				+ " Resultado " + op.calcular(x, y));
	}
	
	public static void main(String[] args) {
		mostrarCalculo(new Soma(), 10, 20);
		mostrarCalculo(new Subtracao(), 10, 20);
		mostrarCalculo(new Multiplicacao(), 10, 20);
		mostrarCalculo(new Divisao(), 10, 20);
	}
}
