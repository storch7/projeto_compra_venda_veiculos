package view;
import main.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Tela que apresenta os veículos adquiridos pelo usuário 
 * @author Guilherme
 *
 */
public class MinhasCompras {
	
	private JFrame janela = new JFrame("Vículos que comprei");
	private JLabel meusVeiculos = new JLabel("Meus Veículos");
	private JPanel veiculosBanco = new JPanel();
	private JPanel detalhes = new JPanel();
	private JButton voltar = new JButton("Voltar");
	private int indexDoElementoSelecionado;
	
	/**
	 * Construtor da classe
	 * @param usuario
	 */
	public MinhasCompras(Usuario usuario) {
				
		//configuração da tela
		janela.setSize(750,600);
		meusVeiculos.setBounds(150, 0, 100, 40);
		veiculosBanco.setBounds(0,40, 400, 600);
		veiculosBanco.setBackground(Color.white);
		detalhes.setBounds(400,40,350,600);
		detalhes.setBackground(Color.cyan);
		
		List<String> listaVeiculos = new ArrayList<String> ();
		
		//laço de repetição que passa por todos os modelos de veiculos
		//adicionados no banco de dados de usuarios:
		for(int i = 0; i < usuario.getListaComprados().size(); i++) {
			listaVeiculos.add(usuario.getListaComprados().get(i).getModelo());
		}
		
		JList<Object> veiculosAdicionados = new JList<Object> (listaVeiculos.toArray());
		
		voltar.setBounds(115, 450, 100, 45);
		
		//painel de detalhes
		JLabel modeloVeiculo = new JLabel("Modelo:");
		JLabel modeloBanco = new JLabel();
		JLabel marcaVeiculo = new JLabel("Marca:");
		JLabel marcaBanco = new JLabel();
		JLabel ano = new JLabel("Ano:");
		JLabel anoBanco = new JLabel();
		JLabel valor = new JLabel("Valor:");
		JLabel valorBanco = new JLabel();
		JLabel descricao = new JLabel("Descrição:");
		JLabel descricaoBanco = new JLabel();
		
		modeloVeiculo.setBounds(10, 25, 70, 45);
		modeloBanco.setBounds(90,25,70,40);
		marcaVeiculo.setBounds(10, 60, 70,40);
		marcaBanco.setBounds(90,60,70,40);
		ano.setBounds(10, 95, 70,40);
		anoBanco.setBounds(60, 95, 70, 40);
		valor.setBounds(10, 135, 70,40);
		valorBanco.setBounds(60, 135, 70, 40);
		descricao.setBounds(10, 175, 70,40);
		descricaoBanco.setBounds(80,175,70,40);
		
		detalhes.add(modeloVeiculo);
		detalhes.add(modeloBanco);
		detalhes.add(marcaVeiculo);
		detalhes.add(marcaBanco);
		detalhes.add(ano);
		detalhes.add(anoBanco);
		detalhes.add(valor);
		detalhes.add(valorBanco);
		detalhes.add(descricao);
		detalhes.add(descricaoBanco);
		
		//adicionando os elementos no JFRAME principal
		veiculosBanco.add(veiculosAdicionados);
		
		detalhes.add(voltar);
		detalhes.setLayout(null);
		
		janela.add(meusVeiculos);
		janela.add(veiculosBanco);
		janela.add(detalhes);
		
		janela.setLayout(null);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		
		//eventos
		
		veiculosAdicionados.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int index = veiculosAdicionados.getSelectedIndex();
								
				modeloBanco.setText(usuario.getListaComprados().get(index).getModelo());
				marcaBanco.setText(usuario.getListaComprados().get(index).getMarca());
				anoBanco.setText(Integer.toString(usuario.getListaComprados().get(index).getAno()));
				valorBanco.setText(Double.valueOf(usuario.getListaComprados().get(index).getValor()).toString());
				descricaoBanco.setText(usuario.getListaComprados().get(index).getDescricaoAdicional());
			}
		});
		
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
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
