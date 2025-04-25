package br.fam.modelagem;

import java.io.File;
import java.util.Date;

import javax.swing.JOptionPane;

//github.com/barretuino/poo_2024/tree/main/Arquivos

public class PrimeiroTexto {
	public static void main (String args[]){
		 String var = ""; 
		 File arquivo = new File("MeuTexto.txt");		 		 
		 var = "Nome: " + arquivo.getName() 
		 			+ "\n\r"; 
		 var += "Caminho: " 
		 			+ arquivo.getAbsolutePath() 
		 			+ "\n\r"; 
		 var += "Existe? " 
		 			+ arquivo.exists() + "\n\r";  
		 var += "É um diretório? " 
		 			+ arquivo.isDirectory() + "\n\r"; 
		 var += "É um arquivo? " 
		 			+ arquivo.isFile() + "\n\r"; 
		 var += "Pode ser lido? " 
		 			+ arquivo.canRead() + "\n\r";  
		 var += "Pode ser escrito? " 
		 			+ arquivo.canWrite() + "\n\r";
		 try {
			 Date dataModificado = 
				 new Date(arquivo.getCanonicalFile()
						 .lastModified());
			 var += "Data da Última Modificação "
					 + dataModificado + "\n\r" ;
		 }catch(Exception e) {
		 }
		  JOptionPane.showMessageDialog( null, var, 
			 "Informacao do Sistema", 
			 JOptionPane.INFORMATION_MESSAGE );		 
	}
}
