package testes;
import main.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Classe para realização do test JUnity do desconto que o usuário poderia 
 * ceder ao comprador no momento de realizar uma compra 
 * @author Guilherme
 *
 */
class TesteDesconto {

	@SuppressWarnings("deprecation")
	@Test
	
	/**
	 * método que realiza o teste de aplicação de desconto
	 */
	void aplicarDesconto() {
		
		Carro carroTeste = new Carro();
		carroTeste.setValor(23500);
		
		Double valorEsperado = carroTeste.getValor() * 0.95;
		
		assertEquals(valorEsperado, carroTeste.aplicarDesconto(5.0));
	}

}
