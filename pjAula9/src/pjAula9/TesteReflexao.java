package pjAula9;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class TesteReflexao {
	public static void main(String[] args) {
		//Reflection de Atributos
		for(Field f : 
				Usuario.class.getDeclaredFields()) {
			System.out.println("Nome: " + f.getName()
					+ " tipo: " + f.getType());			
			if(f.getType().getCanonicalName().equals("boolean")) {
			 Method[] metodos = Usuario.class.getDeclaredMethods();
			 for(Method m : metodos) {
				 if(m.getName().substring(0, 1).equals("is"));
				     System.out.println("Atende o padrão");
			 }
			}
		
		}
		
		
	}
}