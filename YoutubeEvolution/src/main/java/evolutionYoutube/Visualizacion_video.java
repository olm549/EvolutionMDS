package evolutionYoutube;
import com.vaadin.ui.Button;
import com.vaadin.ui.VerticalLayout;

import evolutionYoutube.Lista_comentarios;
import evolutionYoutube.Vista_video_comun;

public class Visualizacion_video extends Visualizacion_video_ventana {
	public Lista_comentarios _unnamed_Lista_comentarios_;

	
	
	public Visualizacion_video() {
		descargar.setEnabled(true);
		listaComentarios.addComponent(new Lista_comentarios());
		
		
		
	}
	public void descargar() {
		throw new UnsupportedOperationException();
	}
}