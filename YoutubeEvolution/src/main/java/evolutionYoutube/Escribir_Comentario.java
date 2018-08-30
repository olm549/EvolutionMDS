package evolutionYoutube;

import database.BD_general;

public class Escribir_Comentario extends Escribir_Comentario_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Comentario _comentario;
	public Visualizacion_video_administrador _unnamed_Visualizacion_video_administrador_;
	public Visualizacion_video_registrado _unnamed_Visualizacion_video_registrado_;

	public Escribir_Comentario() {
		
	}
	public void enviar_comentario() {
		BD_general bd = new BD_general();
		bd.enviar_comentario(comentario, 1,2);//1 = idvideo 2 = idusuario
	}
	public Comentario get_comentario() {
		return _comentario;
	}
	public void set_comentario(Comentario _comentario) {
		this._comentario = _comentario;
	}
}