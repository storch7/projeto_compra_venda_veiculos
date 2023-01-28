package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import banco.Banco;
import main.Usuario;

/**
 * Tela de cadastro de Usuarios
 * @author Guilherme
 *
 */
public class Cadastro {
	
	private JFrame cadastro = new JFrame();
	private JButton volta = new JButton("Voltar");
	private JLabel informe = new JLabel("Preencha com as informações abaixo:");
	private JLabel nome = new JLabel("Nome:");
	private JTextField nomeBox = new JTextField();
	private JLabel documento = new JLabel("CPF:");
	private JTextField documentoBox = new JTextField();
	private JLabel endereco = new JLabel("Endereço:");
	private JTextField enderecoBox = new JTextField();
	private JLabel telefone = new JLabel("Telefone de contato:");
	private JTextField telefoneBox = new JTextField();
	private JLabel senha = new JLabel("Senha:");
	private JTextField senhaBox = new JTextField();
	private JButton cadastrar = new JButton("Cadastrar");
	
	/**
	 * Construtor da classe
	 */
	public Cadastro () {
		
		cadastro.setSize(1250, 750);
		volta.setBounds(25, 25, 100, 40);
		informe.setBounds(500, 15, 250, 40);
		nome.setBounds(425, 60, 100, 40);
		nomeBox.setBounds(425, 100, 350, 40);
		documento.setBounds(425, 150, 100, 40);
		documentoBox.setBounds(425, 190, 350, 40);
		endereco.setBounds(425, 240, 100, 40);
		enderecoBox.setBounds(425, 280, 350, 40);
		telefone.setBounds(425, 330, 250, 40);
		telefoneBox.setBounds(425, 370, 350, 40);
		senha.setBounds(425, 420, 100, 40);
		senhaBox.setBounds(425, 460,350, 40);
		cadastrar.setBounds(1115, 650, 100, 40);
		cadastro.setLayout(null);
				
		cadastro.add(volta);
		cadastro.add(informe);
		cadastro.add(nome);
		cadastro.add(nomeBox);
		cadastro.add(documento);
		cadastro.add(documentoBox);
		cadastro.add(endereco);
		cadastro.add(enderecoBox);
		cadastro.add(telefone);
		cadastro.add(telefoneBox);
		cadastro.add(senha);
		cadastro.add(senhaBox);
		cadastro.add(cadastrar);
		
		cadastro.setResizable(false);
		cadastro.setLocationRelativeTo(null);
		
		//EVENTOS
		
		//Voltar para a tela inicial
		volta.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Login();
				cadastro.dispose();
			}
		});
		
		//Cadastrando um usuário
		cadastrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Notificando em caso de informações em conflito
				String nomeUsuario = nomeBox.getText();
				String cpfUsuario = documentoBox.getText();
				String contatoUsuario = telefoneBox.getText();
				String senhaUsuario = senhaBox.getText();
								
				if (nomeUsuario.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Insira o nome do Usuário");
				}
				
				if (cpfUsuario.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Insira o CPF do usuário");
				}
				
				if (contatoUsuario.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Insita o contato do Usuário");
				}
				
				if (senhaUsuario.isEmpty() == true) {
					JOptionPane.showMessageDialog(null, "Insita uma senha para o Usuário");
				}
						
				if (nomeUsuario.isEmpty() == false & cpfUsuario.isEmpty() == false & contatoUsuario.isEmpty() == false & senhaUsuario.isEmpty() == false) {
					
					Usuario novoCadastro = new Usuario();
					
					novoCadastro.setNome(nomeUsuario);
					novoCadastro.setCpf(cpfUsuario);
					novoCadastro.setContato(contatoUsuario);
					novoCadastro.setEndereco(enderecoBox.getText());
					novoCadastro.setSenha(senhaUsuario);
					
					Banco.getUsuario().add(novoCadastro);
					JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
					
					new Login();
					cadastro.dispose();
				}			
		};
		
	});
	
		//ultima linha do construtor
	cadastro.setVisible(true);
	}
}
