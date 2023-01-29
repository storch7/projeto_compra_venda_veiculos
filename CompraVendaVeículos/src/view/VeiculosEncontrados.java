package view;
import java.util.List;
import javax.swing.*;

/**
 * Tela que mostra os veículos de determinada marca, acrescentados ao "banco de dados"
 * @author Guilherme
 *
 */
public class VeiculosEncontrados {
	private JFrame janela = new JFrame("Veículos por marca");
	
	/**
	 * Construtor da classe
	 * @param list
	 */
	public VeiculosEncontrados(List<String> list) {
		janela.setSize(600,600);
		JList<Object> veiculosAdicionados = new JList<Object> (list.toArray());
		
		janela.add(veiculosAdicionados);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);
	}
}
