import java.awt.event.ActionListener;

import javax.swing.JFrame;

public interface CRUDFam extends  ActionListener{
	public void inserir(Object o);
	public void alterar(int codigo);
	public Object pesquisar(int codigo);
	public boolean remover(int codigo);
}
