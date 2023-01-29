package testes;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import main.Usuario;

/**
 * Classe para realização do test JUnity que confere o formato de telefone que o usuário insere
 * @author Guilherme
 *
 */
class TesteTelefone {

	@SuppressWarnings("deprecation")
	@Test
	
	/**
	 * Método que realiza a checagem do formato do telefone
	 */
	void checarTelefone() {
		
		String formatoCorreto = "(00) 00000-0000";
		String formatoIncorreto = "12345678910";
		
		assertTrue(Usuario.checarContato(formatoCorreto));
		assertFalse(Usuario.checarContato(formatoIncorreto));
	}

}
