package main;

/**
 * Classe abstrata veículo: dá as características gerais comuns a carros e caminhões
 * @author Guilherme
 *
 */
public abstract class Veiculo {
	
	//atributos 
	private String modelo;
	private String marca;
	private String placa;
	private int ano;
	private int quilometragem;
	private String cor;
	private double valor;
	private String descricaoAdicional;
	
	//metodos
	
	//sets e gets
	//sets
	
	/**
	 * 
	 * @param modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	/**
	 * 
	 * @param marca
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	/**
	 * 
	 * @param placa
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	/**
	 * 
	 * @param ano
	 */
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	/**
	 * 
	 * @param quilometros
	 */
	public void setQuilometragem(int quilometros) {
		quilometragem = quilometros;
	}
	
	/**
	 * 
	 * @param cor
	 * @deprecated
	 */
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	/**
	 * 
	 * @param valor
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	/**
	 * 
	 * @param descricao
	 */
	public void setDescricaoAdicional(String descricao) {
		descricaoAdicional = descricao;
	}
	
	//gets
	
	/**
	 * 
	 * @return
	 */
	public String getModelo() {
		return this.modelo;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getMarca() {
		return this.marca;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPlaca() {
		return this.placa;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getAno() {
		return this.ano;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getQuilometragem() {
		return quilometragem;
	}
	
	/**
	 *@deprecated 
	 * @return
	 */
	public String getCor() {
		return this.cor;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getValor() {
		return this.valor;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getDescricaoAdicional() {
		return descricaoAdicional;
	}
	
	//metodos especificos da classe 
	
	/**
	 * primeiro método da classe: a ser sobrescrito na classe filha
	 * @deprecated
	 */
	public void manifestarInteresse() {
		
	}
	
	/**
	 * segundo método da classe: a ser sobrescrito na classe filha
	 */
	public void aplicarDesconto() {
		//sobrescrever na classe filha
	}
}
