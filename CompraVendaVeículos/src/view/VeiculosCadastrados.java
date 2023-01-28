package view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import main.Carro;
import main.Usuario;

/**
 * Tela que mostra os veículos cadastrados de um usuario específico e dá
 * o direcionamento para a edição do veículo ou sua remoção da lista de cadastro
 * @author Guilherme
 *
 */
public class VeiculosCadastrados {
	
	private JFrame janela = new JFrame("Meus Veículos Cadastrados");
	private JLabel meusVeiculos = new JLabel("Meus Veículos");
	private JPanel veiculosBanco = new JPanel();
	private JPanel detalhamento = new JPanel();
	private JButton voltar = new JButton("Voltar");
	private JButton editar = new JButton("Editar");
	private JButton remover = new JButton("Remover");
	private int indexDoElementoSelecionado;
	
	/**
	 * método construtor da classe
	 * @param usuario
	 */
	public VeiculosCadastrados(Usuario usuario) {
		
		//configuração da tela
		janela.setSize(750,600);
		meusVeiculos.setBounds(150, 0, 100, 40);
		veiculosBanco.setBounds(0,40, 400, 600);
		veiculosBanco.setBackground(Color.white);
		detalhamento.setBounds(400,40,350,600);
		detalhamento.setBackground(Color.cyan);
		
		List<String> listaVeiculos = new ArrayList<String> ();
		
		//laço de repetição que passa por todos os modelos de veiculos
		//adicionados no banco de dados de usuarios:
		for(int i = 0; i < usuario.getListaAnunciados().size(); i++) {
			listaVeiculos.add(usuario.getListaAnunciados().get(i).getModelo());
		}
		
		JList<Object> veiculosAdicionados = new JList<Object> (listaVeiculos.toArray());
		
		voltar.setBounds(115, 100, 100, 45);
		editar.setBounds(115, 200, 100, 45);
		remover.setBounds(115, 300, 100,45);
		
		//adicionando os elementos no JFRAME principal
		veiculosBanco.add(veiculosAdicionados);
		
		detalhamento.add(voltar);
		detalhamento.add(editar);
		detalhamento.add(remover);
		detalhamento.setLayout(null);
		
		janela.add(meusVeiculos);
		janela.add(veiculosBanco);
		janela.add(detalhamento);
		
		janela.setLayout(null);
		janela.setVisible(true);
		janela.setLocationRelativeTo(null);
		janela.setResizable(false);
		
		//eventos
		veiculosAdicionados.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				int elemento = veiculosAdicionados.getSelectedIndex();
				setIndexDoElementoSelecionado(elemento);
			}
		});
		
		voltar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new App(usuario);
				janela.dispose();
			}
		});
		
		remover.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				usuario.getListaAnunciados().remove(getIndexDoElementoSelecionado());
				JOptionPane.showMessageDialog(null, "Veículo removido com sucesso.");
				new App(usuario);
				janela.dispose();
			}
		});
		
		editar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new EdicaoVeiculo(usuario, usuario.getListaAnunciados().get(indexDoElementoSelecionado));
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
