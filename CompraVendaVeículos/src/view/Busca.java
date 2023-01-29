package view;
import main.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import banco.Banco;

/**
 * Tela que faz a busca de veículos por marca
 * @author Guilherme
 *
 */
public class Busca {
	
	private JFrame janela = new JFrame("Buscar veículo por marca");
	private JLabel busca = new JLabel("Digite a marca do veículo que você procura:");
	private JTextField buscaMarca = new JTextField();
	private JButton buscar = new JButton("Buscar");
	
	/**
	 * Construtor da classe
	 */
	public Busca() {
		janela.setSize(600,200);
		janela.setLayout(null);
		busca.setBounds(15,15,250,45);
		buscaMarca.setBounds(15, 50, 530,45);
		buscar.setBounds(15, 105, 100, 40);
		
		janela.add(busca);
		janela.add(buscaMarca);
		janela.add(buscar);
		
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		janela.setVisible(true);
		
		buscar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String marcaProcurada = buscaMarca.getText();
				
				List<String> listaVeiculos = new ArrayList<String> ();
				
				for(int i = 0; i < Banco.getUsuario().size(); i++) {
					
					for(int j = 0; j < Banco.getUsuario().get(i).getListaAnunciados().size(); j++) {
						if(marcaProcurada.equals(Banco.getUsuario().get(i).getListaAnunciados().get(j).getMarca()) == true) 
						{
							String elementoLista = Banco.getUsuario().get(i).getListaAnunciados().get(j).getModelo();
							String placa = Banco.getUsuario().get(i).getListaAnunciados().get(j).getPlaca();
							String anuncio = elementoLista + "/" + placa;
							listaVeiculos.add(anuncio);
						}
					}
				}
				
				if(listaVeiculos.size() == 0 ) {
				JOptionPane.showMessageDialog(null, "Não há veículos desta marca adicionados ao programa");	
				}
				
				else {
					new VeiculosEncontrados(listaVeiculos);
					janela.dispose();
				}
			}
		});
	}
}
