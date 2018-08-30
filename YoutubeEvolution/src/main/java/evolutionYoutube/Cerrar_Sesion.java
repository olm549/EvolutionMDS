package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Cerrar_Sesion extends Cerrar_Sesion_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Administrador _unnamed_Administrador_;
	public Usuario_Registrado _unnamed_Usuario_Registrado_;

	
	public Cerrar_Sesion() {
		cerrarSesion.addClickListener(new Button.ClickListener(){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				cerrar_sesion();
			}
			
		});
	}
	public void cerrar_sesion() {
		((MyUI) UI.getCurrent()).invitado();
	}
}