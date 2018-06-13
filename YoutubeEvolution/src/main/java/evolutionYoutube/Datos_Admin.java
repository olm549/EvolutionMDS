package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Datos_Admin extends Datos_Admin_ventana{
	//public Mi_cuenta_admin _unnamed_Mi_cuenta_admin_;
	public Mi_perfil_Admin _unnamed_Mi_cuenta_admin_;

	
	public Datos_Admin() {
		modificar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).modificar_datos_Admin();
				
			}
			
		});
	}
	public void editar_avatar() {
		throw new UnsupportedOperationException();
	}
}