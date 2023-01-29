package testes;
import main.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TesteDesconto {

	@SuppressWarnings("deprecation")
	@Test
	void test() {
		
		Carro carroTeste = new Carro();
		carroTeste.setValor(23500);
		
		Double valorEsperado = carroTeste.getValor() * 0.95;
		
		assertEquals(valorEsperado, carroTeste.aplicarDesconto(5.0));
	}

}
