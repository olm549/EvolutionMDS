package evolutionYoutube;

import database.BD_general;

public class Suscripciones {
	public Mi_perfil _unnamed_Mi_perfil_;
	public Lista_Suscriptores _unnamed_Lista_Suscriptores_;
	public Lista_Seguidores _unnamed_Lista_Seguidores_;

	public void ver_perfil() {
		throw new UnsupportedOperationException();
	}

	public void dejar_de_seguir() {
		BD_general bd = new BD_general();
		bd.dejar_de_seguir(1);//USUARIO
	}
}