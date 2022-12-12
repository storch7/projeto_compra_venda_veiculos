package main;

public class Carro extends Veiculo{
	
	//atributos 
	private boolean direcaoHidraulica;
	private Cambio cambio;
	private Tracao tracao;
	private boolean flex;
	
	//metodos
	
	//sets e gets
	//sets
	public void setDirecaoHidraulica(boolean direcao) {
		direcaoHidraulica = direcao;
	}
	
	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
	
	public void setTracao(Tracao tracao) {
		this.tracao = tracao;
	}
	
	public void setFlex(boolean informacao) {
		flex = informacao;
	}
	
	//gets
	public boolean getDirecaoHidraulica() {
		return direcaoHidraulica;
	}
	
	public Cambio getCambio() {
		return this.cambio;
	}
	
	public Tracao getTracao() {
		return this.tracao;
	}
	
	public boolean getFlex() {
		return flex;
	}
	
	//metodos especificos da classe
	public double aplicarDesconto(double percentual) {
		double valorAnterior = getValor();
		double novoValor = valorAnterior * (percentual / 100);
		setValor(novoValor);
		
		return novoValor;
	}
	
}
