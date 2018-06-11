package evolutionYoutube;

import database.BD_general;

public class Video_subido_propietario {
	public Lista_videos_subidos _unnamed_Lista_videos_subidos_;
	public Visualizacion_video_creador _unnamed_Visualizacion_video_creador_;
	public Modificar_video _unnamed_Modificar_video_;

	public void editar_miniatura() {
		BD_general bd = new BD_general();
		bd.editar_Miniatura(1);//IDVIDEO
	}

	public void guardar_cambios() {
		
	}

	public void eliminar_video() {
		BD_general bd = new BD_general();
		bd.Eliminar_video(1);//IDVIDEO
	}
}