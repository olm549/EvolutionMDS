package evolutionYoutube;

import database.BD_general;

public class Vista_perfil_administrador extends Ver_perfil_usuario {

	public void eliminar() {
		BD_general bd = new BD_general();
		bd.eliminar_Usuario(1);//IDUSUARIO
	}
}