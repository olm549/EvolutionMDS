package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Editar_lista extends Editar_lista_ventana implements View{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Editar_lista() {
		cambiarnombre.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).cambiarnombre();
				
			}
			
		});
		
	}

	public void seleccionar_todo() {
		throw new UnsupportedOperationException();
	}

	public void eliminar_video_lista() {
		throw new UnsupportedOperationException();
	}
}