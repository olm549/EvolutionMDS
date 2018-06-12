package evolutionYoutube;

import com.vaadin.navigator.View;

public class Videos_subidos extends Videos_subidos_ventana implements View {
	public Mi_perfil _unnamed_Mi_perfil_;
	public Lista_videos_subidos _unnamed_Lista_videos_subidos_;
	
	public Videos_subidos() {
		menu.addComponent(new Menu());
		lista_videos_subidos.addComponent(new Lista_videos_subidos());
	}
}