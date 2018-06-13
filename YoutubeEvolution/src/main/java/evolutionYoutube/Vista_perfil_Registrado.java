package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Vista_perfil_Registrado extends Vista_perfil_Registrado_ventana {
	public Usuario_Registrado _unnamed_Usuario_Registrado_;
	public Suscribirse _unnamed_Suscribirse_;
	
	public Vista_perfil_Registrado() {
	
		listas_reproduccion.addComponent(new Listas_creadas());
		suscripciones.addComponent(new Lista_Suscriptores());
		seguidores.addComponent(new Lista_Seguidores());
		
		volver.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).usuario_registrado();
			}
			
		});
	}
}