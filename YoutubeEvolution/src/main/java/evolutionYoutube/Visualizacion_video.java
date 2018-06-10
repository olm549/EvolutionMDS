package evolutionYoutube;

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