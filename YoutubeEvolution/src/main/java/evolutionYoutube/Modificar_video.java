package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;
import database.Videos;

import com.vaadin.ui.Button.ClickEvent;

public class Modificar_video extends Modificar_video_ventana implements View {
	public Video_subido_propietario _unnamed_Video_subido_propietario_;
	//public Lista_etiquetas _unnamed_Lista_etiquetas_;

	public Modificar_video(Videos vide) {
		
		guardar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				guardar_cambios();
				((MyUI) UI.getCurrent()).videos_subidos();
				
			}
			
		});
		atras.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).videos_subidos();
				
			}
			
		});
	}
	public void guardar_cambios() {
		BD_general bd = new BD_general();
		//bd.modificar_video(aTitulo, aDescripcion, aId_categorias, aEtiquetas);
	}

	public void atras() {
		throw new UnsupportedOperationException();
	}
}