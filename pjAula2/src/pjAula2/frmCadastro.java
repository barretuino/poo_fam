package pjAula2;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class frmCadastro extends JFrame{
	JButton btOK;
	JTextField txtNome;
	
	public frmCadastro() {
		setSize(200, 200);
		setLayout(new FlowLayout());
		
		btOK = new JButton("Cadastrar");
		add(btOK);
		txtNome = new JTextField(40);
		add(txtNome);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new frmCadastro();
	}
}
