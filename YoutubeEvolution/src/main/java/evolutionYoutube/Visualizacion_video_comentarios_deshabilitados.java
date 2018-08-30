package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.Videos;

import com.vaadin.ui.Button.ClickEvent;

public class Visualizacion_video_comentarios_deshabilitados extends Visualizacion_video_comentarios_deshabilitados_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Buscador_videos _unnamed_Buscador_videos_;
	public Ver_video _unnamed_Ver_video_;

	public Visualizacion_video_comentarios_deshabilitados(Videos vide) {
		Visualizacion_video visu = new Visualizacion_video(vide);
		visu.listaComentarios.setEnabled(false);
		visu.listaComentarios.setVisible(false);
		visualizacionComun.addComponent(visu);
		visu.volver.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

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
		//BD_general bd = new BD_general();
		//List lista = bd.ver_etiquetas(1);
	}

	public void visualizar_pantalla_completa() {
		
	}
}