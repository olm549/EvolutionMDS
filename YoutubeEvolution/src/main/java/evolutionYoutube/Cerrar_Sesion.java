package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Window;

public class Cerrar_Sesion extends Cerrar_Sesion_ventana{
	public Administrador _unnamed_Administrador_;
	public Usuario_Registrado _unnamed_Usuario_Registrado_;

	
	public Cerrar_Sesion() {
		cerrarSesion.addClickListener(new Button.ClickListener(){

			@Override
			public void buttonClick(ClickEvent event) {
				cerrar_sesion();
			}
			
		});
	}
	public void cerrar_sesion() {
		((MyUI) UI.getCurrent()).finAccionInv();
	}
}