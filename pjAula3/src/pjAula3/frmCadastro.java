package pjAula3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class frmCadastro extends JFrame implements ActionListener{
	//1. Passo Declarar
	JButton btnCadastrar, btnLimpar, btnPesquisar, btnAlterar, btnExcluir;
	JTextField txtCodigo, txtDescricao, txtQuantidade, txtValorUnitario;
	JLabel lbCodigo, lbDescricao, lbQuantidade, lbValorUnitario;
	JCheckBox ckStatus;
	
	public frmCadastro() {
		setSize(500, 200);
		setLayout(new FlowLayout());
		
		//2. Passo Construir
		btnCadastrar = new JButton("Cadastrar");
		btnLimpar = new JButton("Limpar");
		btnPesquisar = new JButton("Pesquisar");
		btnAlterar = new JButton("Alterar");
		btnExcluir = new JButton("Excluir");
		
		lbCodigo = new JLabel("Código");
		lbDescricao = new JLabel("Descrição");
		lbQuantidade = new JLabel("Quantidade");
		lbValorUnitario = new JLabel("Valor Unitário");
		
		txtCodigo = new JTextField(40);
		txtDescricao = new JTextField(40);
		txtQuantidade = new JTextField(40);
		txtValorUnitario = new JTextField(20);
		
		ckStatus = new JCheckBox("Situação Cadastral");
		
		//3. Passo Adicionar
		add(lbCodigo);
		add(txtCodigo);
		add(lbDescricao);
		add(txtDescricao);
		add(lbQuantidade);
		add(txtQuantidade);
		add(lbValorUnitario);
		add(txtValorUnitario);
		add(ckStatus);
		add(btnCadastrar);
		add(btnAlterar);
		add(btnLimpar);
		add(btnPesquisar);
		add(btnExcluir);
		
		//4 Passo - Tratamento de Ação
		btnCadastrar.addActionListener(this);
		
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnCadastrar) {
			JOptionPane.showConfirmDialog(null, "Clicou em Cadastrar");
		}
	}
	
	public static void main(String[] args) {
		frmCadastro frm = new frmCadastro();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
