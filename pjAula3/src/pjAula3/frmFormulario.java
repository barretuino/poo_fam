package pjAula3;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frmFormulario extends JFrame {
	
	//1 Passo Declarar
	JLabel lbRotulo;
	JTextField txtRotulo;
	
	public frmFormulario() {
		setTitle("Frame Padrão Simples");
		setSize(300, 300);
		setLayout(new FlowLayout());
		
		//2 Construir
		lbRotulo = new JLabel("Exemplo de Texto");
		txtRotulo = new JTextField(20);
		
		//3 Passo adicionar
		add(lbRotulo);
		add(txtRotulo);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new frmFormulario();
	}
}
