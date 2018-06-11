package evolutionYoutube;

import java.util.List;

import database.BD_general;

public class Visualizacion_video extends Visualizacion_video_ventana {
	public Lista_comentarios _unnamed_Lista_comentarios_;

	
	
	public Visualizacion_video() {
		BD_general bd = new BD_general();
		Lista_comentarios lista = new Lista_comentarios();
		Escribir_Comentario escribir = new Escribir_Comentario();
		List listaComents = bd.cargar_Comentarios(1);//PONER ID DEL VIDEO
		//CARGAR COMENTARIOS EN LISTA FOREACH
		descargar.setEnabled(true);
		escribirComentario.addComponent(escribir);
		listaComentarios.addComponent(lista);
		
		
	}
	public void descargar() {
		BD_general bd = new BD_general();
		bd.descargar(1);//DESCARGAR IDVIDEO
	}
}