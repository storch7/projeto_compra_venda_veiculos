package banco;
import java.util.ArrayList;
import main.Usuario;


public class Banco {
	
	public static final ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public static ArrayList<Usuario> getUsuario() {
		return usuarios;
	}
}
