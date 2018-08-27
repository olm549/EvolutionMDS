package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.UI;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Window;

public class Invitado extends Invitado_ventana implements View{
	public Registrarse _unnamed_Registrarse_;
	public Iniciar_Sesion _unnamed_Iniciar_Sesion_;
	public Inicio_Comun _unnamed_Inicio_Comun_;
	
	public Invitado() {
		Inicio_Comun inicio = new Inicio_Comun();
		inicioComun.addComponent(inicio);
		registrarse.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).registrarse();
				
			}
		});
		
		iniciarSesion.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).iniciar_sesion();
				
			}
			
		});
	
		
	}
}