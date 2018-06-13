package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Datos_personales extends Datos_personales_ventana{
	public Mi_cuenta _unnamed_Mi_cuenta_;
	public Modificar_datos_personales _unnamed_Modificar_datos_personales_;

	
	public Datos_personales() {
		modificar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).modificar_datos_personales();
				
			}
			
		});
	}
	public void editar_avatar() {
		throw new UnsupportedOperationException();
	}
}