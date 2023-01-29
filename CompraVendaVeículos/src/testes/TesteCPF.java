package testes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.Usuario;

/**
 * Classe para realização do test JUnity do formato do CPF inserido pelo usuário
 * @author Guilherme
 *
 */
class TesteCPF {

	@Test
	/**
	 * método que realiza o teste checar CPF
	 */
	void checarCPF() {
		String cpfCorreto = "12345678910";
		String cpfErrado = "123.456.789-10";
		assertTrue(Usuario.checarCpf(cpfCorreto));
		assertFalse(Usuario.checarCpf(cpfErrado));
	}
}
