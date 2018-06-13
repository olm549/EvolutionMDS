package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Editar_Categoria extends Editar_categoria_ventana implements View {
	//public Edicion_Categorias _unnamed_Edicion_Categorias_;

	
	public Editar_Categoria() {
		
		guardar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Categorias();
				
			}
			
		});
		atras.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Categorias();
				
			}
			
		});
	}
	public void guardar_cambios() {
		throw new UnsupportedOperationException();
	}
}