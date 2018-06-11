package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;

public class Iniciar_Sesion extends Iniciar_Sesion_ventana implements View{
	public Invitado _unnamed_Invitado_;
	public Recordar_Contrasenia _unnamed_Recordar_Contrasenia_;

	
	public Iniciar_Sesion() {
		iniciarSesion.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				iniciar_sesion();
			}
			
		});
		cancelarBoton.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).invitado();
			}
			
		});
	}
	public void cancelar() {
		((MyUI) UI.getCurrent()).invitado();
		
	}

	public void iniciar_sesion() {
		BD_general bd = new BD_general();
		bd.iniciar_sesion(email.getCaption(), contrasenia.getCaption());
		
		
		((MyUI) UI.getCurrent()).usuario_registrado();

		//((MyUI) UI.getCurrent()).administrador();

		//((MyUI) UI.getCurrent()).invitado();
	}

	public void olvida_contrasenia() {
		((MyUI) UI.getCurrent()).recordarContrasenia();		
	}
}