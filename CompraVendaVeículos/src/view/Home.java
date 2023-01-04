package view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Home {
	
	private JFrame janela = new JFrame("Home Page");
	private JLabel container = new JLabel();
	private JLabel logIn = new JLabel("Faça seu LogIn");
	private JLabel usuario = new JLabel("Usuário:");
	private JTextField usuarioBox = new JTextField();
	private JLabel senha = new JLabel("Senha:");
	private JTextField senhaBox = new JTextField();
	private JButton entrar = new JButton("Entrar");
	private JLabel opcao = new JLabel("Ainda não tem uma conta?");
	private JButton cadastro = new JButton("Cadastrar");
	
	public Home () {
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
		
		janela.setVisible(true);
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
	}
	
	public static void main (String[] args) {
		Home teste = new Home();
	}
	
}
