package evolutionYoutube;

import java.io.File;

import com.vaadin.server.ExternalResource;
import com.vaadin.server.FileResource;
import com.vaadin.ui.Image;

import database.BD_general;
import database.Videos;

public class Visualizacion_video extends Visualizacion_video_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Lista_comentarios _unnamed_Lista_comentarios_;

	
	
	public Visualizacion_video(Videos vide) {
		//BD_general bd = new BD_general();
		Lista_comentarios lista = new Lista_comentarios();
		Escribir_Comentario escribir = new Escribir_Comentario();
		//List<?> listaComents = bd.cargar_Comentarios(1);//PONER ID DEL VIDEO
		//CARGAR COMENTARIOS EN LISTA FOREACH
		descargar.setEnabled(true);
		escribirComentario.addComponent(escribir);
		listaComentarios.addComponent(lista);
		titulo.setValue(vide.getTitulo());
		descripcion.setValue(vide.getDescrVideo()+"");
		visualizaciones.setValue(vide.getNumVisualizaciones()+"");
		vide.setNumVisualizaciones(vide.getNumVisualizaciones()+1);
		nombre.setValue(vide.getAutor().getApodo()+"");
		Image img = new Image("",new ExternalResource(""+vide.getAutor().getAvatar()));
		img.setWidth("60px");
		img.setHeight("60px");
		avatar.addComponent(img);
		
		avatar.setWidth("20px");
		avatar.setHeight("20px");
		
		FileResource resource = new FileResource(new File(vide.getContenidoVideo()));
		video.setSource(resource);
		
		
		
	}
	public void descargar() {
		BD_general bd = new BD_general();
		bd.descargar(1);//DESCARGAR IDVIDEO
	}
}