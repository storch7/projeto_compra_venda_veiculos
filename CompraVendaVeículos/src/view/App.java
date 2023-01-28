package view;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import banco.Banco;
import main.Usuario;
import main.Veiculo;

/**
 * Tela principal da aplicação
 * @author Guilherme
 *
 */
public class App {
	
	private JFrame tela = new JFrame("Tela Inicial");
	
	//Elementos do perfil
	private JPanel perfilUsuario = new JPanel();
	private JLabel perfil = new JLabel("Perfil");
	private JLabel nomeUser = new JLabel("Nome do usuário:");
	private JLabel nomeBanco;
	private JLabel contatoUser = new JLabel("Contato:");
	private JLabel contatoBanco;
	private JButton cadastrarVeiculos = new JButton("Cadastrar Veículos");
	private JButton veiculosCadastrados = new JButton("Veículos Cadastrados");
	private JButton comprar = new JButton("Comprar Veículo");
	private JButton minhasVendas = new JButton("Minhas Vendas");
	private JButton minhasCompras = new JButton("Minhas Compras");
	private JButton sair = new JButton("Sair");
	
	
	//Elementos da lista de veículos
	private JPanel produtos = new JPanel();
	private JLabel produtosDisponiveis = new JLabel("Veículos disponíveis:");
	
	//elementos do detalhamento 
	private JPanel detalhes = new JPanel();
	private JLabel detalhesProduto = new JLabel("Detalhes do veículo:");
	
	/**
	 * método cosntrutor da classe
	 * @param usuario
	 */
	public App (Usuario usuario) {
		
		//DESIGN DA TELA
		tela.setSize(1250, 750);
		
		//itens do perfil
		perfilUsuario.setBounds(0, 0, 300, 750);
		perfilUsuario.setBackground(Color.gray);
		perfil.setBounds(130, 15, 100, 45);
		nomeUser.setBounds(25, 75, 100, 45);
		nomeBanco = new JLabel(usuario.getNome());
		nomeBanco.setBounds(135, 75, 100, 45);
		contatoUser.setBounds(25, 100, 100, 45);
		contatoBanco = new JLabel(usuario.getContato());
		contatoBanco.setBounds(85, 100, 100, 45);
		cadastrarVeiculos.setBounds(70, 200, 155, 45);
		veiculosCadastrados.setBounds(65, 250, 165, 45);
		comprar.setBounds(75, 300, 145, 45);
		minhasVendas.setBounds(75, 350, 145, 45);
		minhasCompras.setBounds(75, 400, 145, 45);
		sair.setBounds(25, 650, 100,45);
		
		//veículos
		produtos.setBounds(300, 0, 450, 750);
		produtos.setBackground(Color.cyan);
		produtosDisponiveis.setBounds(175,5,175,45);
		
		List<String> listaVeiculos = new ArrayList<String> ();
		
		//Laço de Repetição que acessa os elementos presentes no "Banco de dados"
		for(int i = 0; i < Banco.getUsuario().size(); i++) {
			
			//Laço de repetição que acessa todos os veículos de cada um dos usuários
			//e adiciona na lista de veículos
			for(int j = 0; j < Banco.getUsuario().get(i).getListaAnunciados().size(); j++) {
				String elementoLista = Banco.getUsuario().get(i).getListaAnunciados().get(j).getModelo();
				String placa = Banco.getUsuario().get(i).getListaAnunciados().get(j).getPlaca();
				String anuncio = elementoLista + "/" + placa;
				listaVeiculos.add(anuncio);
			}
			
		}
		
		JList<Object> veiculosAdicionados = new JList<Object> (listaVeiculos.toArray());
		veiculosAdicionados.setBounds(0, 50, 450, 750);
		
		//detalhamento
		detalhes.setBounds(750, 0, 500, 750);
		detalhesProduto.setBounds(200,15,150,45);
		
		JPanel detalhesContainer = new JPanel();
		JLabel anunciante = new JLabel("Anunciante:");
		JLabel anuncianteBanco = new JLabel();
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
		
		//Configurações da tela de detalhes 		
		detalhesContainer.setBounds(20,40, 500, 300);
		detalhesContainer.setLayout(new GridLayout(6,2));
		detalhesContainer.add(anunciante);
		detalhesContainer.add(anuncianteBanco);
		detalhesContainer.add(modeloVeiculo);
		detalhesContainer.add(modeloBanco);
		detalhesContainer.add(marcaVeiculo);
		detalhesContainer.add(marcaBanco);
		detalhesContainer.add(ano);
		detalhesContainer.add(anoBanco);
		detalhesContainer.add(valor);
		detalhesContainer.add(valorBanco);
		detalhesContainer.add(descricao);
		detalhesContainer.add(descricaoBanco);
		
		detalhesContainer.setVisible(false);
		
		//adicionando ao JLabel perfil
		perfilUsuario.add(perfil);
		perfilUsuario.add(nomeUser);
		perfilUsuario.add(nomeBanco);
		perfilUsuario.add(contatoUser);
		perfilUsuario.add(contatoBanco);
		perfilUsuario.add(cadastrarVeiculos);
		perfilUsuario.add(veiculosCadastrados);
		perfilUsuario.add(minhasVendas);
		perfilUsuario.add(comprar);
		perfilUsuario.add(minhasCompras);
		perfilUsuario.add(sair);
		
		perfilUsuario.setLayout(null);
		tela.add(perfilUsuario);
		
		//adicionando ao label anuncios
		produtos.setLayout(null);
		produtos.add(produtosDisponiveis);
		produtos.add(veiculosAdicionados);
		
		tela.add(produtos);
		
		//adicionando ao label de detalhes
		detalhes.add(detalhesProduto);
		detalhes.add(detalhesContainer);
		detalhes.setLayout(null);
		
		tela.add(detalhes);
		
		
		tela.setLayout(null);
		tela.setResizable(false);
		tela.setLocationRelativeTo(null);
		tela.setVisible(true);
		
		//EVENTOS
		sair.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Login();
				tela.dispose();
				
			}
		});
		
		cadastrarVeiculos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new CadastroVeiculo(usuario);
				tela.dispose();
			}
		});
		
		veiculosAdicionados.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				detalhesContainer.setVisible(true);
								
				int elemento = veiculosAdicionados.getSelectedIndex();
				String veiculoDaLista = listaVeiculos.get(elemento);
				String[] vetorVeiculo = veiculoDaLista.split("/");
				String veiculoSelecionado = vetorVeiculo[0];
				String placaVeiculoSelecionado = vetorVeiculo[1];
							
				//laço de repeticao que percorre o banco de dados a procura do veículo em questão
				for(int i = 0; i < Banco.getUsuario().size(); i++) {
					
					//laço de repetição que percorre elementos por usuario
					for(int j = 0; j < Banco.getUsuario().get(i).getListaAnunciados().size(); j++) {
						
						//String que armazena o nome e placa do veiculo do banco
						String veiculoDoBanco = Banco.getUsuario().get(i).getListaAnunciados().get(j).getModelo();
						String placaVeiculoBanco = Banco.getUsuario().get(i).getListaAnunciados().get(j).getPlaca();
						
						//caso o veiculo em questão seja igual ao presente no banco
						if(veiculoSelecionado.equals(veiculoDoBanco) == true && placaVeiculoSelecionado.equals(placaVeiculoBanco) == true) {
							
							anuncianteBanco.setText(Banco.getUsuario().get(i).getNome());
							modeloBanco.setText(Banco.getUsuario().get(i).getListaAnunciados().get(j).getModelo());
							marcaBanco.setText(Banco.getUsuario().get(i).getListaAnunciados().get(j).getMarca());
							anoBanco.setText(Integer.toString(Banco.getUsuario().get(i).getListaAnunciados().get(j).getAno()));
							valorBanco.setText(String.valueOf(Banco.getUsuario().get(i).getListaAnunciados().get(j).getValor()));
							descricaoBanco.setText(Banco.getUsuario().get(i).getListaAnunciados().get(j).getDescricaoAdicional());
						}
					}
				}
			}
		});
		
		veiculosCadastrados.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new VeiculosCadastrados(usuario);
				tela.dispose();
			}
		});
		
		
	}
	
}
