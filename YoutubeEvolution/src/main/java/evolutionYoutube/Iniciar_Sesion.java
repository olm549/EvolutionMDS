package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Iniciar_Sesion extends Iniciar_Sesion_ventana implements View{
	public Invitado _unnamed_Invitado_;
	public Recordar_Contrasenia _unnamed_Recordar_Contrasenia_;

	
	public Iniciar_Sesion() {
		iniciarSesion.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).usuario_registrado();
			}
			
		});
		cancelarBoton.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).finAccionInv();
			}
			
		});
	}
	public void cancelar() {
		
	}

	public void iniciar_sesion() {
		throw new UnsupportedOperationException();
	}

	public void olvida_contrasenia() {
		throw new UnsupportedOperationException();
	}
}