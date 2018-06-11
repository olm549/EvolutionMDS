package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UI;

import database.BD_general;

public class Recordar_Contrasenia extends Recordar_Contrasenia_ventana implements View {
	public Iniciar_Sesion _unnamed_Iniciar_Sesion_;
	public Enviar_Correo_Electronico _unnamed_Enviar_Correo_Electronico_;

	public Recordar_Contrasenia() {
		recuperarB.addClickListener(new Button.ClickListener(){

			@Override
			public void buttonClick(ClickEvent event) {
				recuperar_contrasenia();
				
			}
			
		});
	}
	public void cancelar() {

		((MyUI) UI.getCurrent()).iniciar_sesion();

	}

	public void recuperar_contrasenia() {
		BD_general bd = new BD_general();
		bd.recuperar_contrasenia(correo.getValue());
		((MyUI) UI.getCurrent()).iniciar_sesion();
	}
}