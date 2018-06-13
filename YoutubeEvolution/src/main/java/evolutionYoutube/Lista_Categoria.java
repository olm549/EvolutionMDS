package evolutionYoutube;

import java.util.Vector;
//import evolutionYoutube.Categoria;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Categoria extends Lista_Categoria_ventana {
	public Categorias _unnamed_Categorias_;
	//public Vector<Categoria> _unnamed_Categoria_ = new Vector<Categoria>();
	
	public Lista_Categoria() {
		
		crearcategoria.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).crearcategoria();
				
			}
			
		});
		editarcategoria.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).editarcategoria();
				
			}
			
		});
	}
}