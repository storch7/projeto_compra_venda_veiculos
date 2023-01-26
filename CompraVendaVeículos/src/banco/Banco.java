package banco;
import java.util.ArrayList;
import main.Usuario;

/**
 * Classe que simula o banco de dados
 * @author Guilherme
 *
 */
public class Banco {
	
	public static final ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	//MÉTODOS
	public static ArrayList<Usuario> getUsuario() {
		return usuarios;
	}
		
}
