package evolutionYoutube;

import com.vaadin.navigator.View;

import database.BD_general;

public class Suscripciones extends Suscripciones_ventana implements View {
	public Mi_perfil _unnamed_Mi_perfil_;
	public Lista_Suscriptores _unnamed_Lista_Suscriptores_;
	public Lista_Seguidores _unnamed_Lista_Seguidores_;

	public Suscripciones() {
		menu.addComponent(new Menu());
		seguidores.addComponent(new Lista_Seguidores_Suscriptores_ventana());
	}
	public void ver_perfil() {
		throw new UnsupportedOperationException();
	}

	public void dejar_de_seguir() {
		//BD_general bd = new BD_general();
		//bd.dejar_de_seguir(1);//USUARIO
	}
}