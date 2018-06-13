package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;

public class Vista_perfil_administrador extends Vista_perfil_administrador_ventana {
	public Vista_perfil_administrador() {
		
		listas_reproduccion.addComponent(new Listas_creadas());
		suscripciones.addComponent(new Lista_Suscriptores());
		seguidores.addComponent(new Lista_Seguidores());
		
		volver.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).administrador();
			}
			
		});
	
}
	public void eliminar() {
		BD_general bd = new BD_general();
		bd.eliminar_Usuario(1);//IDUSUARIO
	}
}