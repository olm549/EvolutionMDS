package evolutionYoutube;

import database.BD_general;

public class Visualizacion_video extends Visualizacion_video_ventana {
	public Lista_comentarios _unnamed_Lista_comentarios_;

	
	
	public Visualizacion_video() {
		BD_general bd = new BD_general();
		descargar.setEnabled(true);
		escribirComentario.addComponent(new Escribir_Comentario());
		listaComentarios.addComponent(new Lista_comentarios());
	//	bd.cargar_Comentarios(1);//PONER ID DEL VIDEO
		
		
	}
	public void descargar() {
		throw new UnsupportedOperationException();
	}
}