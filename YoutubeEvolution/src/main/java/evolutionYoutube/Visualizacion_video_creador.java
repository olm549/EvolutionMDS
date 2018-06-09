package evolutionYoutube;

public class Visualizacion_video_creador extends Visualizacion_video_creador_ventana {
	public Video_subido_propietario _unnamed_Video_subido_propietario_;
	public Ver_video _unnamed_Ver_video_;
	
	
	public Visualizacion_video_creador() {
		Visualizacion_video visu = new Visualizacion_video();
		visu.descargar.setVisible(true);
		visu.descargar.setEnabled(true);
		visu.aniadeALista.setVisible(true);
		visu.aniadeALista.setEnabled(true);
		visu.aniadirALista.setVisible(true);
		visu.aniadirALista.setEnabled(true);
		visu.eliminarVideo.setVisible(true);
		visu.eliminarVideo.setEnabled(true);
		visualizacionComun.addComponent(visu);
	}

	public void deshabilitar_comentario() {
		throw new UnsupportedOperationException();
	}

	public void aniadir_a_lista() {
		throw new UnsupportedOperationException();
	}
}