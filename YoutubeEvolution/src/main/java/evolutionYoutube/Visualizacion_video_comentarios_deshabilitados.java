package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

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

				((MyUI) UI.getCurrent()).usuario_registrado();
			}
		});
	}
	
	public void usuario(Object aVer_perfil_usuario) {
		throw new UnsupportedOperationException();
	}

	public void volver(Object aInicio_Comun) {
		throw new UnsupportedOperationException();
	}

	public void ver_etiquetas() {
		throw new UnsupportedOperationException();
	}

	public void visualizar_pantalla_completa() {
		throw new UnsupportedOperationException();
	}
}