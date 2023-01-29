package view;
import main.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

import banco.Banco;
/**
 * Tela que apresenta os veículos disponíveis para que o usuário possa comprar
 * @author Guilherme
 *
 */
public class CompraDeVeiculos {
	
	private JFrame janela = new JFrame();
	private JLabel veiculosDisponiveis = new JLabel("Veículos disponíveis)");
	private JPanel veiculosBanco = new JPanel();
	private JPanel detalhamento = new JPanel();
	private JButton voltar = new JButton("Voltar");
	private JButton comprar = new JButton("Comprar");
	private int indexDoElementoSelecionado;
	
	/**
	 * método construtor da classe
	 * @param usuario
	 */
	public CompraDeVeiculos(Usuario usuario) {
		janela.setSize(750,600);
		veiculosDisponiveis.setBounds(150, 0, 100, 40);
		veiculosBanco.setBounds(0,40, 400, 600);
		veiculosBanco.setBackground(Color.white);
		detalhamento.setBounds(400,40,350,600);
		detalhamento.setBackground(Color.cyan);
		
		List<String> listaVeiculos = new ArrayList<String> ();
		
		for(int i = 0; i < Banco.getUsuario().size(); i++) {
			
			//Laço de repetição que acessa todos os veículos de cada um dos usuários, com exceção do usuario logado
			//e adiciona na lista de veículos
			for(int j = 0; j < Banco.getUsuario().get(i).getListaAnunciados().size(); j++) {
				if(Banco.getUsuario().get(i).getCpf().equals(usuario.getCpf()) == true) {
					;
				}
				if(Banco.getUsuario().get(i).getCpf().equals(usuario.getCpf()) == false) {
					String elementoLista = Banco.getUsuario().get(i).getListaAnunciados().get(j).getModelo();
					String placa = Banco.getUsuario().get(i).getListaAnunciados().get(j).getPlaca();
					String anuncio = elementoLista + "/" + placa;
					listaVeiculos.add(anuncio);
				}
			}
		}
		
		JList<Object> veiculosAdicionados = new JList<Object> (listaVeiculos.toArray());
		
		voltar.setBounds(115, 100, 100, 45);
		comprar.setBounds(115, 300, 100,45);
		veiculosBanco.add(veiculosAdicionados);
		
		detalhamento.add(voltar);
		detalhamento.add(comprar);
		detalhamento.setLayout(null);
		
		janela.add(veiculosDisponiveis);
		janela.add(veiculosBanco);
		janela.add(detalhamento);
		
		janela.setLayout(null);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		
		//eventos
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new App(usuario);
				janela.dispose();
			}
		});
		
		comprar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String buscaVeiculo = listaVeiculos.get(indexDoElementoSelecionado);
				String[] vetorVeiculo = buscaVeiculo.split("/");
				String placaVeiculoSelecionado = vetorVeiculo[1];
								
				for(int i = 0; i < Banco.getUsuario().size(); i++) {
					
					for(int j = 0; j < Banco.getUsuario().get(i).getListaAnunciados().size(); j++) {
						System.out.println(Banco.getUsuario().get(i).getListaAnunciados().get(j).getPlaca().equals(placaVeiculoSelecionado));
						if(Banco.getUsuario().get(i).getListaAnunciados().get(j).getPlaca().equals(placaVeiculoSelecionado) == true) {
							usuario.getListaComprados().add(Banco.getUsuario().get(i).getListaAnunciados().get(j));
							Banco.getUsuario().get(i).getListaVendidos().add(Banco.getUsuario().get(i).getListaAnunciados().get(j));	
							Banco.getUsuario().get(i).getListaAnunciados().remove(j);
							break;
						}
						
					}
				}
				
				JOptionPane.showMessageDialog(null, "Veículo adquirido com sucesso!");
				new App(usuario);
				janela.dispose();
				
			}
		});
	}
	
	//sets e gets
	/**
	 * 
	 * @param index
	 */
	public void setIndexDoElementoSelecionado(int index) {
		indexDoElementoSelecionado = index;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getIndexDoElementoSelecionado() {
		return indexDoElementoSelecionado;
	}
}
