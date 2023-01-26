package main;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe Usuário que recebe todos os elementos do código
 * @author Guilherme
 *
 */
public class Usuario {
	
	//atributos 
	private String cpf;
	private String senha;
	private String nome;
	private String endereco;
	private String contato;
	private List<Veiculo> listaVeiculosAnunciados;
	private List<Veiculo> listaVeiculosVendidos;
	private List<Veiculo> listaVeiculosComprados;
		
	//metodos
	/**
	 * Construtor da Classe
	 */
	public Usuario() {
		listaVeiculosAnunciados = new ArrayList<Veiculo> ();
		listaVeiculosVendidos = new ArrayList<Veiculo> ();
		listaVeiculosComprados = new ArrayList<Veiculo> ();
	}
	
	//sets e gets
	//sets
	
	/**
	 * 
	 * @param cpf
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	/**
	 * 
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/**
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * 
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	/**
	 * 
	 * @param contato
	 */
	public void setContato(String contato) {
		this.contato = contato;
	}
	
	//gets
	
	/**
	 * 
	 * @return
	 */
	public String getCpf() {
		return this.cpf;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getSenha() {
		return this.senha;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getEndereco() {
		return this.endereco;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getContato() {
		return this.contato;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Veiculo> getListaAnunciados() {
		return listaVeiculosAnunciados;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Veiculo> getListaVendidos() {
		return listaVeiculosVendidos;
	}
	
	/**
	 * 
	 * @return
	 */
	public List<Veiculo> getListaComprados() {
		return listaVeiculosComprados;
	}
	
	//metodos especificos da classe
	
	/**
	 * Anúncio de um veículo: desloca o objeto para a lista de veículos anunciados
	 * @param veiculo
	 */
	public void AnunciarVeiculo(Veiculo veiculo) {
		listaVeiculosAnunciados.add(veiculo);
	}
	
	/**
	 * Venda de um veículo: desloca o objeto para a lista de veículos vendidos
	 * @param veiculo
	 */
	public void VenderVeiculo(Veiculo veiculo) {
		listaVeiculosVendidos.add(veiculo);
	}
	
	/**
	 * Compra de um veículo: desloca o objeto para a lista de veículos vendidos
	 * @param veiculo
	 */
	public void ComprarVeiculo(Veiculo veiculo) {
		listaVeiculosComprados.add(veiculo);
	}
	
	/**
	 * Checagem da validade de um CPF
	 */
	public void checarCpf() {
		if (this.cpf.length() != 9) {
			this.cpf = null;
			JOptionPane.showMessageDialog(null, "Insira um CPF válido");
		}
		
		else {
			System.out.println("CPF válido.");
		}
	}
	
	/**
	 * Checagem da validade de um contato
	 * @deprecated
	 */
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

