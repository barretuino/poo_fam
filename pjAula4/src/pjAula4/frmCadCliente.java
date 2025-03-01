package pjAula4;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class frmCadCliente extends JFrame implements ActionListener{
	//1 Passo - Declarar
	JPanel pnCampos, pnBotoes, pnLabels;
	JLabel lbNome, lbEndereco, lbTelefone, lbCep;
	JTextField txtNome, txtEndereco, txtTelefone, txtCep;
	JButton btIncluir, btExcluir, btPesquisar, btAlterar;
	
	public frmCadCliente() {
		super("Cadastro de Clientes");
		setSize(500, 200);
		setLayout(new BorderLayout());
		
		//2 Passo - Construção
		pnCampos = new JPanel(new GridLayout(4,2));
		pnBotoes = new JPanel(new GridLayout(1,6, 5, 5));
		pnLabels = new JPanel(new GridLayout(4,1));
		lbNome = new JLabel("Nome");
		lbEndereco = new JLabel("Endereço");
		lbTelefone = new JLabel("Telefone");
		lbCep = new JLabel("CEP");
		txtNome = new JTextField(20);
		txtEndereco = new JTextField(20);
		txtTelefone = new JTextField(20);
		txtCep = new JTextField(20);
		btIncluir = new JButton("Cadastrar");
		btPesquisar = new JButton("Pesquisar");
		btAlterar = new JButton("Alterar");
		btExcluir = new JButton("Excluir");
		
		//3 Passo - Adicionar
		pnLabels.add(lbNome);
		pnLabels.add(lbEndereco);
		pnLabels.add(lbTelefone);
		pnLabels.add(lbCep);
		
		pnCampos.add(txtNome);
		pnCampos.add(txtEndereco);
		pnCampos.add(txtTelefone);
		pnCampos.add(txtCep);
		
		pnBotoes.add(btIncluir);
		pnBotoes.add(btAlterar);
		pnBotoes.add(btExcluir);
		pnBotoes.add(btPesquisar);
		
		add(pnLabels, BorderLayout.WEST);
		add(pnCampos, BorderLayout.CENTER);
		add(pnBotoes, BorderLayout.SOUTH);
	
		//4 Passo - Adiciona ao Listener de Ações
		btIncluir.addActionListener(this);
		btAlterar.addActionListener(this);
		btPesquisar.addActionListener(this);
		btExcluir.addActionListener(this);
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btIncluir) {
			JOptionPane.showConfirmDialog(null, "Clicou em Incluir");
		}
		if(e.getSource() == btAlterar) {
			JOptionPane.showMessageDialog(null, "Clicou em Alterar");
		}
		if(e.getSource() == btPesquisar) {
			JOptionPane.showMessageDialog(null,
					"Pesquisar", "Deseja Pesquisar", JOptionPane.ERROR_MESSAGE);
		}
		if(e.getSource() == btExcluir) {
			System.out.println("Console Clicou em Excluir");
		}
	}
	public static void main(String[] args) {
		frmCadCliente frm = new frmCadCliente();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
