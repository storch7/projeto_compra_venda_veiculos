package main;

/**
 * Classe Caminhão: herda as caraceterísicas da classe pai Veículo
 * @author Guilherme
 *
 */
public class Caminhao extends Veiculo {

	//atributos
	private int quantidadeEixos;
	private double comprimento;
	private double capacidadeCarga;
	private TipoCaminhao tipoCaminhao;
	
	//metodos
	
	//sets e gets 
	//sets
	
	/**
	 * 
	 * @param valor
	 */
	public void setQuantidadeEixos(int valor) {
		quantidadeEixos = valor;
	}
	
	/**
	 * 
	 * @param comprimento
	 */
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	/**
	 * 
	 * @param capacidade
	 */
	public void setCapacidadeCarga(double capacidade) {
		capacidadeCarga = capacidade;
	}
	
	/**
	 * 
	 * @param tipo
	 */
	public void setTipoCaminhao (TipoCaminhao tipo) {
		tipoCaminhao = tipo;
	}
	
	//gets
	
	/**
	 * 
	 * @return
	 */
	public int getQuantidadeEixos() {
		return quantidadeEixos;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getComprimento() {
		return this.comprimento;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}
	
	/**
	 * 
	 * @return
	 */
	public TipoCaminhao getTipoCaminhao() {
		return tipoCaminhao;
	}
	
	//metodos especificos da classe
	
	/**
	 * Método sobrescrito da classe pai veículo
	 * @deprecated
	 * @param percentual
	 * @return
	 */
	public double aplicarDesconto(double percentual) {
		double valorAnterior = getValor();
		double novoValor = valorAnterior * (percentual / 100);
		setValor(novoValor);
		
		return novoValor;
	}

}
