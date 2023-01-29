package main;

/**
 * Classe Carro: herda as caraceterísticas da classe pai Veículo
 * @author Guilherme
 *
 */
public class Carro extends Veiculo{
	
	//atributos 
	private boolean direcaoHidraulica;
	private Cambio cambio;
	private Tracao tracao;
	private boolean flex;
	
	//metodos
	
	//sets e gets
	//sets
	
	/**
	 * 
	 * @param direcao
	 */
	public void setDirecaoHidraulica(boolean direcao) {
		direcaoHidraulica = direcao;
	}
	
	/**
	 * 
	 * @param cambio
	 */
	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
	
	/**
	 * 
	 * @param tracao
	 */
	public void setTracao(Tracao tracao) {
		this.tracao = tracao;
	}
	
	/**
	 * 
	 * @param informacao
	 */
	public void setFlex(boolean informacao) {
		flex = informacao;
	}
	
	//gets
	
	/**
	 * 
	 * @return
	 */
	public boolean getDirecaoHidraulica() {
		return direcaoHidraulica;
	}
	
	/**
	 * 
	 * @return
	 */
	public Cambio getCambio() {
		return this.cambio;
	}
	
	/**
	 * 
	 * @return
	 */
	public Tracao getTracao() {
		return this.tracao;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean getFlex() {
		return flex;
	}
	
	//metodos especificos da classe
	
	/**
	 * Método sobrescrito da classe pai Veículo
	 * @deprecated
	 * @param percentual
	 * @return
	 */
	public double aplicarDesconto(double percentual) {
		double valorAnterior = getValor();
		double novoValor = valorAnterior * ((100 - percentual) / 100);
		setValor(novoValor);
		
		return novoValor;
	}
	
}
