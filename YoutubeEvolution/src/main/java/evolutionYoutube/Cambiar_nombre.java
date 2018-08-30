package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Cambiar_nombre extends Cambiar_nombre_ventana implements View{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Editar_listas_reproduccion _unnamed_Editar_listas_reproduccion_;
	
	public Cambiar_nombre() {
		guardar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mis_listas();
				
			}
			
		});
		cancelar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mis_listas();
				
			}
			
		});
	}

	public void cancelar() {
		throw new UnsupportedOperationException();
	}

	public void guardar() {
		throw new UnsupportedOperationException();
	}
}