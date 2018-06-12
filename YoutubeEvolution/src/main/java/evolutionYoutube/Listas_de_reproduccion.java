package evolutionYoutube;

import com.vaadin.navigator.View;

public class Listas_de_reproduccion extends Listas_de_reproduccion_ventana implements View {
	public Mi_perfil _unnamed_Mi_perfil_;
	public Lista_de_listas _unnamed_Lista_de_listas_;
	
	public Listas_de_reproduccion() {
		menu.addComponent(new Menu());
		listas.addComponent(new Lista_de_listas());
	}
}