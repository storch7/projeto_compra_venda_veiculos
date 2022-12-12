package main;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Usuario {
	
	//atributos 
	private String cpf;
	private String senha;
	private String nome;
	private String endereco;
	private String contato;
	private List<Carro> listaCarro;
	private List<Caminhao> listaCaminhao;
	
	//metodos
	public Usuario() {
		listaCarro = new ArrayList<Carro> ();
		listaCaminhao = new ArrayList<Caminhao> ();
	}
	
	//sets e gets
	//sets
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	//gets
	public String getCpf() {
		return this.cpf;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public String getContato() {
		return this.contato;
	}
	
	public List<Carro> getListaCarros() {
		return listaCarro;
	}
	
	public List<Caminhao> getListaCaminhoes() {
		return listaCaminhao;
	}
	
	//metodos especificos da classe
	public void addCarro(Carro carro) {
		listaCarro.add(carro);
	}
	
	public void addCaminhao(Caminhao caminhao) {
		listaCaminhao.add(caminhao);
	}
	
	public void checarCpf() {
		if (this.cpf.length() != 9) {
			this.cpf = null;
			JOptionPane.showMessageDialog(null, "Insira um CPF válido");
		}
		
		else {
			System.out.println("CPF válido.");
		}
	}
	
	public void checarContato() {
		if(this.contato.length() > 15) {
			this.contato = null;
			JOptionPane.showMessageDialog(null, "Insira um número de contato válido");
		}
		
		else {
			System.out.println("CPF válido.");
		}
	}
	
}

