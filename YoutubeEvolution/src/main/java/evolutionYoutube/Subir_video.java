package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;

import com.vaadin.ui.Button.ClickEvent;

public class Subir_video extends Subir_video_ventana implements View {
	public Usuario_Registrado _unnamed_Usuario_Registrado_;

	public Subir_video() {
		subir.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				subir_video();
				
			}
		});
	}
	public void subir_video() {
		BD_general bd = new BD_general();
	//	bd.subir_video(titulo.getValue(), miniatura.getValue(), deshCom.getValue(), descripcion
		//,etiquetas.getValue(), categoria.getValue(), lista.getValue());
		((MyUI) UI.getCurrent()).usuario_registrado();
	}

	public void miniatura() {
		throw new UnsupportedOperationException();
	}

	public void aniade_a_lista() {
		throw new UnsupportedOperationException();
	}
}