package evolutionYoutube;

public class Pagina_de_inicio_registrado extends Pagina_de_inicio_registrado_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Usuario_Registrado _unnamed_Usuario_Registrado_;
	public Lista_videos_relacionados _unnamed_Lista_videos_relacionados_;
	public Lista_videos_suscripciones _unnamed_Lista_videos_suscripciones_;
	public Pagina_de_inicio_registrado() {
		Inicio_Comun inicio = new Inicio_Comun();
		//inicio.Cargar_Videos();
		inicio.contenedorVideos.addComponent(new Lista_videos_suscripciones());
		inicio.contenedorMeGusta.addComponent(new Lista_videos_relacionados());
		inicioComun.addComponent(inicio);
		
		//BD_general bd = new BD_general();
		//List listaSuscr = bd.Cargar_Videos_Suscripciones();
		//List listaRel = bd.Cargar_Videos_Relacionados();
		
	}
}