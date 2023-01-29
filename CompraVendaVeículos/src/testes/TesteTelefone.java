package testes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Usuario;

class TesteTelefone {

	@SuppressWarnings("deprecation")
	@Test
	void checarTelefone() {
		//Aceita apenas o telefone no formato: (DDD) + " " + 5 PRIMEIROS DÍGITOS + "-" + 4 ÚLTIMOS DÍGITOS
		String formatoCorreto = "(00) 00000-0000";
		String formatoIncorreto = "12345678910";
		
		assertTrue(Usuario.checarContato(formatoCorreto));
		assertFalse(Usuario.checarContato(formatoIncorreto));
	}

}
