package evolutionYoutube;

import java.util.List;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;

public class Visualizacion_video_comentarios_deshabilitados extends Visualizacion_video_comentarios_deshabilitados_ventana{
	public Buscador_videos _unnamed_Buscador_videos_;
	public Ver_video _unnamed_Ver_video_;

	public Visualizacion_video_comentarios_deshabilitados() {
		Visualizacion_video visu = new Visualizacion_video();
		visu.listaComentarios.setEnabled(false);
		visu.listaComentarios.setVisible(false);
		visualizacionComun.addComponent(visu);
		visu.volver.addClickListener(new Button.ClickListener() {
			
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

		((MyUI) UI.getCurrent()).usuario_registrado();
	}

	public void ver_etiquetas() {
		BD_general bd = new BD_general();
		List lista = bd.ver_etiquetas();
	}

	public void visualizar_pantalla_completa() {
		
	}
}