package evolutionYoutube;

import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class Visualizacion_video_administrador extends Visualizacion_video_administrador_ventana {
	public Ver_video _unnamed_Ver_video_;
	public Video_Usuario _unnamed_Video_Usuario_;
	public Escribir_Comentario _unnamed_Escribir_Comentario_;

	
	public Visualizacion_video_administrador() {
		Visualizacion_video visu = new Visualizacion_video();
		visu.eliminarVideo.setVisible(true);
		visu.eliminarVideo.setEnabled(true);
		visu.eliminarVideo.addClickListener(new ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				eliminar_video();
				
			}
			
		});
		visu.descargar.setVisible(true);
		visu.descargar.setEnabled(true);
		visualizacionComun.addComponent(new Visualizacion_video());
	}
	
	public void eliminar_video() {
		throw new UnsupportedOperationException();
	}

	public void eliminar_comentario() {
		throw new UnsupportedOperationException();
	}
}