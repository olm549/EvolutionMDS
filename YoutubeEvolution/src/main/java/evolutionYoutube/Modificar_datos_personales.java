package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Modificar_datos_personales extends Modificar_datos_personales_ventana implements View {
	public Datos_personales _unnamed_Datos_personales_;

	public Modificar_datos_personales() {
		guardar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mi_perfil_registrado();
				
			}
			
		});
	    cancelar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mi_perfil_registrado();
				
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