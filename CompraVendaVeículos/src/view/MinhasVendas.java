package view;
import main.*;

import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

/**
 * Tela que apresenta os veículos que cada usuário vendeu pela aplicação
 * @author Guilherme
 *
 */
public class MinhasVendas {
	
	private JFrame janela = new JFrame("Minhas Vendas");
	
	/**
	 * método construtor da classe
	 * @param usuario
	 */
	public MinhasVendas(Usuario usuario) {
		janela.setSize(600,600);
		
		List<String> listaVeiculos = new ArrayList<String> ();
		
		//laço de repetição que passa por todos os modelos de veiculos
		//adicionados no banco de dados de usuarios:
		for(int i = 0; i < usuario.getListaVendidos().size(); i++) {
			listaVeiculos.add(usuario.getListaVendidos().get(i).getModelo());
		}
		
		JList<Object> veiculosAdicionados = new JList<Object> (listaVeiculos.toArray());
		
		janela.add(veiculosAdicionados);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}
}
