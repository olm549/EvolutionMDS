package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;
import database.Videos;

import com.vaadin.ui.Button.ClickEvent;

public class Visualizacion_video_creador extends Visualizacion_video_creador_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public Video_subido_propietario _unnamed_Video_subido_propietario_;
	public Ver_video _unnamed_Ver_video_;
	
	
	public Visualizacion_video_creador(Videos vide) {
		Visualizacion_video visu = new Visualizacion_video(vide);
		visu.descargar.setVisible(true);
		visu.descargar.setEnabled(true);
		visu.aniadeALista.setVisible(true);
		visu.aniadeALista.setEnabled(true);
		visu.aniadirALista.setVisible(true);
		visu.aniadirALista.setEnabled(true);
		visu.eliminarVideo.setVisible(true);
		visu.eliminarVideo.setEnabled(true);
		visualizacionComun.addComponent(visu);
		visu.volver.addClickListener(new Button.ClickListener() {
			
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).usuario_registrado();
				
			}
		});
	}

	public void deshabilitar_comentario() {
	/*	BD_general bd = new BD_general();
		for(Object comentario : bd.cargar_Comentarios(1)) {
		bd.eliminar_comentarioAdmin(Comentario.ID);
		}*/
	}

	public void aniadir_a_lista() {
		BD_general bd = new BD_general();
		bd.aniade_a_lista(1, 1,1);//ID VIDEO E ID LISTA
	}
}