package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Modificar_Datos_Admin extends Modificar_Datos_Admin_ventana implements View {
	//public Mi_cuenta_admin _unnamed_Mi_cuenta_admin_;
	public Datos_Admin _unnamed_Mi_cuenta_admin_;

	
	public Modificar_Datos_Admin() {
		guardar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Mi_perfil_Admin();
				
			}
			
		});
	    cancelar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Mi_perfil_Admin();
				
			}
			
		});
	}
	public void guardar() {
		throw new UnsupportedOperationException();
	}

	public void cancelar() {
		throw new UnsupportedOperationException();
	}
}