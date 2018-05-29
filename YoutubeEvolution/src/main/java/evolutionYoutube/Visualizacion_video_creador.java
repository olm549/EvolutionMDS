package evolutionYoutube;

public class Visualizacion_video_creador extends Visualizacion_video_creador_ventana {
	public Video_subido_propietario _unnamed_Video_subido_propietario_;
	public Ver_video _unnamed_Ver_video_;
	
	
	public Visualizacion_video_creador() {
		Visualizacion_video visu = new Visualizacion_video();
		visualizacionComun.addComponent(visu);
	}

	public void deshabilitar_comentario() {
		throw new UnsupportedOperationException();
	}

	public void aniadir_a_lista() {
		throw new UnsupportedOperationException();
	}
}