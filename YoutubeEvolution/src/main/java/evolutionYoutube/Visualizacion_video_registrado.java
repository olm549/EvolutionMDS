package evolutionYoutube;

public class Visualizacion_video_registrado extends Visualizacion_video_registrado_ventana {
	public Ver_video _unnamed_Ver_video_;
	public Escribir_Comentario _unnamed_Escribir_Comentario_;
	
	
	public Visualizacion_video_registrado() {
		Visualizacion_video visu = new Visualizacion_video();
		//Enable - disable buttons
		visualizacionComun.addComponent(visu);
	}

	public void aniade_a_lista() {
		throw new UnsupportedOperationException();
	}

	public void eliminar_comentario_propio() {
		throw new UnsupportedOperationException();
	}

	public void me_gusta() {
		throw new UnsupportedOperationException();
	}
}