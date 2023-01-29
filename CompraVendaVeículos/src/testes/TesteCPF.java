package testes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.Usuario;

class TesteCPF {

	@Test
	void checarCPF() {
		String cpfCorreto = "12345678910";
		String cpfErrado = "123.456.789-10";
		assertTrue(Usuario.checarCpf(cpfCorreto));
		assertFalse(Usuario.checarCpf(cpfErrado));
	}
}
