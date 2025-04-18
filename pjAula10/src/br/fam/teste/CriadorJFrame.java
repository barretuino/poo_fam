package br.fam.teste;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.lang.reflect.Field;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.fam.model.CRUDName;
import br.fam.model.Cliente;
import br.fam.model.Description;
import br.fam.model.Produto;

public class CriadorJFrame {

    public static void criarJFrameComAtributos(Class<?> classe) {
    	CRUDName anotacaoClasse = classe.getAnnotation(CRUDName.class); 
        JFrame frame = new JFrame(anotacaoClasse == null ?
        		"Visualizador de " + classe.getSimpleName()
        		: anotacaoClasse.nome());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pnCampos = new JPanel(new GridLayout(0, 2)); // Layout em grade com duas colunas

        Field[] campos = classe.getDeclaredFields();

        for (Field campo : campos) {
        	Description anotacao = campo.getAnnotation(Description.class);
            JLabel label = new JLabel(anotacao.nome() + ":");
            pnCampos.add(label);

            Class<?> tipoCampo = campo.getType();
            JTextField textField = null;
            JCheckBox checkBox = null;

            if (tipoCampo == String.class) {
                textField = new JTextField(20);
                pnCampos.add(textField);
            } else if (tipoCampo == int.class || tipoCampo == double.class || tipoCampo == float.class) {
                textField = new JTextField(10);
                pnCampos.add(textField);
                // Adicionar lógica de validação aqui se necessário
            } else if (tipoCampo == boolean.class) {
                checkBox = new JCheckBox();
                pnCampos.add(checkBox);
            } else {
                // Para outros tipos, você pode adicionar um JLabel com o nome do tipo
                if(tipoCampo.isEnum()) {
                	JComboBox combo = new JComboBox(tipoCampo.getEnumConstants());
                	pnCampos.add(combo);
                }
            }
        }
        
        frame.add(pnCampos, BorderLayout.CENTER);
        JButton btInserir, btAlterar, btPesquisar, btExcluir;
        btInserir = new JButton("Inserir");
        btAlterar = new JButton("Alterar");
        btPesquisar = new JButton("Pesquisar");
        btExcluir = new JButton("Excluir");
        
        JPanel pnBotoes = new JPanel(new GridLayout(1,4));
    	pnBotoes.add(btInserir);
    	pnBotoes.add(btAlterar);
        pnBotoes.add(btExcluir);
        pnBotoes.add(btPesquisar);

        if(anotacaoClasse != null) {
	        btInserir.setEnabled(anotacaoClasse.insert());
	       	btAlterar.setEnabled(anotacaoClasse.update());
	        btExcluir.setEnabled(anotacaoClasse.delete());
	        btPesquisar.setEnabled(anotacaoClasse.search());
        }
        
        frame.add(pnBotoes, BorderLayout.NORTH);
        
        frame.pack(); // Ajusta o tamanho da janela para caber nos componentes
        frame.setVisible(true);
    }

    public static void main(String[] args) {
         criarJFrameComAtributos(Produto.class);
         criarJFrameComAtributos(Cliente.class);
    }
}