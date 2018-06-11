package evolutionYoutube;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_Videos;
import database.BD_general;

public class Vista_video_comun extends Vista_video_comun_ventana{
	public Buscador_videos _unnamed_Buscador_videos_;
	public Ver_video _unnamed_Ver_video_;

	public Vista_video_comun() {
		volver.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				volver();
				
			}
		});
	}
	
	public void usuario() {
		
		((MyUI) UI.getCurrent()).ver_perfil_usuario();
	}

	public void volver() {
		
		((MyUI) UI.getCurrent()).invitado();
	}

	public void ver_etiquetas() {
		BD_general bd = new BD_general();
		List lista = bd.ver_etiquetas();
		//añadir etiquetas a la vista
	}

}