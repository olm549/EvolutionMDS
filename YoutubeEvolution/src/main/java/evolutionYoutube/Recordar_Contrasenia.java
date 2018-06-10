package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.UI;

public class Recordar_Contrasenia extends Recordar_Contrasenia_ventana implements View {
	public Iniciar_Sesion _unnamed_Iniciar_Sesion_;
	public Enviar_Correo_Electronico _unnamed_Enviar_Correo_Electronico_;

	public void cancelar() {

		((MyUI) UI.getCurrent()).iniciar_sesion();

	}

	public void recuperar_contrasenia() {

		((MyUI) UI.getCurrent()).iniciar_sesion();
	}
}