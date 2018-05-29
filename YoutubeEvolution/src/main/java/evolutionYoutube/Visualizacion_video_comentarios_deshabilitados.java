package evolutionYoutube;

public class Visualizacion_video_comentarios_deshabilitados extends Visualizacion_video_comentarios_deshabilitados_ventana{
	public Buscador_videos _unnamed_Buscador_videos_;
	public Ver_video _unnamed_Ver_video_;

	public Visualizacion_video_comentarios_deshabilitados() {
		Visualizacion_video visu = new Visualizacion_video();
		visualizacionComun.addComponent(visu);
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