package evolutionYoutube;

import java.util.Vector;
//import evolutionYoutube.Video_Usuario;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.Usuario_registrado;

import com.vaadin.ui.Button.ClickEvent;

public class Lista_Video_Usuario extends Lista_Video_Usuario_ventana implements View{
	public Lista_Usuarios _unnamed_Lista_Usuarios_;
	//public Vector<Video_Usuario> _unnamed_Video_Usuario_ = new Vector<Video_Usuario>();
	
	
	public Lista_Video_Usuario(Usuario_registrado usuario_registrado) {
		atras.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Lista_Usuarios();
				
			}
			
		});
	}
}