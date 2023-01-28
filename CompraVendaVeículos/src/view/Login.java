package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import banco.Banco;

/**
 * Primeira tela do aplicativo: Tela de Login do Usuário
 * @author Guilherme
 *
 */
public class Login {
	
	private JFrame janela = new JFrame("Login");
	private JLabel logIn = new JLabel("Faça seu LogIn");
	private JLabel usuario = new JLabel("Usuário:");
	private JTextField usuarioBox = new JTextField();
	private JLabel senha = new JLabel("Senha:");
	private JTextField senhaBox = new JTextField();
	private JButton entrar = new JButton("Entrar");
	private JLabel opcao = new JLabel("Ainda não tem uma conta?");
	private JButton cadastro = new JButton("Cadastrar");
	
	/**
	 * Método construtor da classe
	 */
	public Login () {
		janela.setSize(1250, 750);
		logIn.setBounds(565, 70, 115, 70);
		usuario.setBounds(475, 150, 100, 40);
		usuarioBox.setBounds(475, 200, 250, 40);
		senha.setBounds(475, 250, 100, 40);
		senhaBox.setBounds(475, 300, 250, 40);
		entrar.setBounds(550, 370, 100, 40);
		opcao.setBounds(475, 475, 200, 40);
		cadastro.setBounds(650, 475, 100, 40);
		janela.setLayout(null);
		
		janela.add(logIn);
		janela.add(usuario);
		janela.add(usuarioBox);
		janela.add(senha);
		janela.add(senhaBox);
		janela.add(entrar);
		janela.add(opcao);
		janela.add(cadastro);
		
		janela.setResizable(false);
		janela.setLocationRelativeTo(null);
		
		//eventos
		
		//ir para a tela de cadastro
		cadastro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Cadastro();
				janela.dispose();
			}
		});
		
		//Login do Usuário
		entrar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
								
				if(Banco.getUsuario().size() == 0) {
					JOptionPane.showMessageDialog(null, "Ainda não há usuários cadastrados");
				}
				
				else {
					
					if(usuarioBox.getText().isEmpty() == true || senhaBox.getText().isEmpty() == true) {
						JOptionPane.showMessageDialog(null, "Insira as informações dos campos");
					}
					
					else {
						
						for(int i = 0; i < Banco.getUsuario().size(); i++) {
							
							if (Banco.getUsuario().get(i).getCpf().equals(usuarioBox.getText()) & Banco.getUsuario().get(i).getSenha().equals(senhaBox.getText())) {
								
								new App(Banco.getUsuario().get(i));
								janela.dispose();
																
							}
							
						}
					}
				}
			}
		});
		
		//ultima linha do construtor
		janela.setVisible(true);
	}
	
	/**
	 * método main; utilizado para a execução do código
	 * @param args
	 */
	public static void main (String... args) {
		Login testando = new Login();
		
	}
	
}
