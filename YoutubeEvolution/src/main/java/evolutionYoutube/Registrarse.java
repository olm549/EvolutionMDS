package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Registrarse extends Registrarse_ventana implements View{
	public Invitado _unnamed_Invitado_;
	public Enviar_Correo_Electronico _enviar_Correo_Electronico;

	
	public Registrarse() {
		registrarseBoton.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				//REGISTRO
				((MyUI) UI.getCurrent()).invitado();
				
			}
			
		});
		cancelarBoton.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).invitado();
				
			}
			
		});
	}
	
	
	public void registrarse() {
		
	}

	public void cancelar() {
		
	}
}