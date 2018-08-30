package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.ComboBox;

public class Subir_video extends Subir_video_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Usuario_Registrado _unnamed_Usuario_Registrado_;
	ComboBox<database.Categorias> select;
	public Subir_video() {
		subir.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				subir_video();
				
			}
		});
		BD_general bd = new BD_general();
		select =new ComboBox<>("Selecciona o añade una categoría");
		select.setItems(bd.Cargar_Categorias());
		categoria1.addComponent(select);
		select.setItemCaptionGenerator(database.Categorias::getNombre);
		
	}
	public void subir_video() {
		BD_general bd = new BD_general();
	     bd.subir_video(titulo.getValue(), miniatura.getValue(), url.getValue(), MyUI.getUsuarioLogged().getID(),comentarios.getValue(), descripcion,etiquetas.getValue(),select.getValue().getNombre(), 1);
		((MyUI) UI.getCurrent()).usuario_registrado();
	}
    //Hace falta?
	public void miniatura() {
		throw new UnsupportedOperationException();
	}

	public void aniade_a_lista() {
		throw new UnsupportedOperationException();
	}
}