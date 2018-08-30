package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Videos;

public class Visualizacion_video_registrado extends Visualizacion_video_registrado_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Ver_video _unnamed_Ver_video_;
	public Escribir_Comentario _unnamed_Escribir_Comentario_;
	
	
	public Visualizacion_video_registrado(Videos vide) {
		Visualizacion_video visu = new Visualizacion_video(vide);
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

	public void aniade_a_lista() {
		BD_general bd = new BD_general();
		bd.aniade_a_lista(1, 1,1);//ID VIDEO E IDLISTA
	}

	public void eliminar_comentario_propio() {
		BD_general bd = new BD_general();
		bd.eliminar_comentario_propio(1,1,1);//IDCOMENTARIO,USUARIO Y VIDEO1
	}

	public void me_gusta() {
		BD_general bd = new BD_general();
		bd.me_gusta(1,1);//IDVIDEO
	}
}