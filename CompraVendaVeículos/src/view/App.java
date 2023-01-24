package view;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.ArrayList;
import javax.swing.*;
import banco.Banco;
import main.Usuario;
import main.Veiculo;

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
	private JButton minhasVendas = new JButton("Minhas Vendas");
	private JButton minhasCompras = new JButton("Minhas Compras");
	private JButton sair = new JButton("Sair");
	
	
	//Elementos da lista de veículos
	private JPanel produtos = new JPanel();
	private JLabel produtosDisponiveis = new JLabel("Veículos disponíveis");
	
	//elementos do detalhamento 
	private JPanel detalhes = new JPanel();
	private JLabel detalhesProduto = new JLabel("Detalhes do veículo");
	
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
		minhasVendas.setBounds(75, 300, 145, 45);
		minhasCompras.setBounds(75, 350, 145, 45);
		sair.setBounds(25, 650, 100,45);
		
		//veículos
		produtos.setBounds(300, 0, 450, 750);
		produtos.setBackground(Color.cyan);
		produtosDisponiveis.setBounds(175,15,100,45);
		
		List<String> listaVeiculos = new ArrayList<String> ();
		
		//Laço de Repetição que acessa os elementos presentes no "Banco de dados"
		for(int i = 0; i < Banco.getUsuario().size(); i++) {
			
			//Laço de repetição que acessa todos os veículos de cada um dos usuários
			for(int j = 0; j < Banco.getUsuario().get(i).getListaAnunciados().size(); j++) {
				String elementoLista = Banco.getUsuario().get(i).getListaAnunciados().get(j).getModelo();
				listaVeiculos.add(elementoLista);
			}
			
		}
		
		JList<Object> veiculosAdicionados = new JList<Object> (listaVeiculos.toArray());
		
		//detalhamento
		detalhes.setBounds(750, 0, 500, 750);
		detalhesProduto.setBounds(500,15,100,45);
				
		//adicionando ao JLabel perfil
		perfilUsuario.add(perfil);
		perfilUsuario.add(nomeUser);
		perfilUsuario.add(nomeBanco);
		perfilUsuario.add(contatoUser);
		perfilUsuario.add(contatoBanco);
		perfilUsuario.add(cadastrarVeiculos);
		perfilUsuario.add(veiculosCadastrados);
		perfilUsuario.add(minhasVendas);
		perfilUsuario.add(minhasCompras);
		perfilUsuario.add(sair);
		
		perfilUsuario.setLayout(null);
		tela.add(perfilUsuario);
		
		//
		produtos.add(produtosDisponiveis);
		produtos.add(veiculosAdicionados);
		
		tela.add(produtos);
		
		//
		detalhes.add(detalhesProduto);
		tela.add(detalhes);
		
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
	}
	
}
