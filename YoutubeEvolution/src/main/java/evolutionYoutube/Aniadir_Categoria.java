package evolutionYoutube;
import evolutionYoutube.Edicion_Categorias;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.UI;

import evolutionYoutube.Administrador;

public class Aniadir_Categoria extends Aniadir_Categoria_ventana implements View {
	public Edicion_Categorias _unnamed_Edicion_Categorias_;
	public Administrador _unnamed_Administrador_;

	public Aniadir_Categoria() {
	aniadirCategoria.addClickListener(new Button.ClickListener() {

		@Override
		public void buttonClick(ClickEvent event) {
			crear_categoria();
			((MyUI) UI.getCurrent()).administrador();
			
		}
		
	});
	cancelar.addClickListener(new Button.ClickListener() {

		@Override
		public void buttonClick(ClickEvent event) {
			crear_categoria();
			((MyUI) UI.getCurrent()).administrador();
			
		}
		
	});
	}
	public void crear_categoria() {
		throw new UnsupportedOperationException();
	}
}