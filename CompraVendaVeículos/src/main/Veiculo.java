package main;

public abstract class Veiculo {
	
	//atributos 
	private String modelo;
	private String marca;
	private int ano;
	private int quilometragem;
	private String cor;
	private double valor;
	private String descricaoAdicional;
	
	//metodos
	
	//sets e gets
	//sets
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void setQuilometragem(int quilometros) {
		quilometragem = quilometros;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void setDescricaoAdicional(String descricao) {
		descricaoAdicional = descricao;
	}
	
	//gets
	public String getModelo() {
		return this.modelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public int getQuilometragem() {
		return quilometragem;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getDescricaoAdicional() {
		return descricaoAdicional;
	}
	
	//metodos especificos da classe 
	public void manifestarInteresse() {
		
	}
	
	public void aplicarDesconto() {
		//sobrescrever na classe filha
	}
}
