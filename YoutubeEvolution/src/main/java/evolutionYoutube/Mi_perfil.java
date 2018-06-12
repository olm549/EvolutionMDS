package evolutionYoutube;

import com.vaadin.navigator.View;

public class Mi_perfil extends Mi_perfil_ventana implements View {
	public Usuario_Registrado _unnamed_Usuario_Registrado_;
	public Suscripciones _unnamed_Suscripciones_;
	public Mi_cuenta _unnamed_Mi_cuenta_;
	public Videos_subidos _unnamed_Videos_subidos_;
	public Listas_de_reproduccion _unnamed_Listas_de_reproduccion_;

	public Mi_perfil() {
		menu.addComponent(new Menu());
		// NO FUNCIONA NO SE POR QUE mi_cuenta.addComponent(new Mi_cuenta());
		cerrar_sesion.addComponent(new Cerrar_Sesion());
	}
	
	/**public void cerrar_sesion() {
		throw new UnsupportedOperationException();
	}**/
	
	
}