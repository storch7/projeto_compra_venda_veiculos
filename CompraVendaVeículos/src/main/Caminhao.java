package main;

public class Caminhao extends Veiculo {

	//atributos
	private int quantidadeEixos;
	private double comprimento;
	private double capacidadeCarga;
	private TipoCaminhao tipoCaminhao;
	
	//metodos
	
	//sets e gets 
	//sets
	public void setQuantidadeEixos(int valor) {
		quantidadeEixos = valor;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	public void setCapacidadeCarga(double capacidade) {
		capacidadeCarga = capacidade;
	}
	
	public void setTipoCaminhao (TipoCaminhao tipo) {
		tipoCaminhao = tipo;
	}
	
	//gets
	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}
	
	public double getComprimento() {
		return this.comprimento;
	}
	
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	
	public TipoCaminhao getTipoCaminhao() {
		return tipoCaminhao;
	}
	
	//metodos especificos da classe
	public double aplicarDesconto(double percentual) {
		double valorAnterior = getValor();
		double novoValor = valorAnterior * (percentual / 100);
		setValor(novoValor);
		
		return novoValor;
	}

}
