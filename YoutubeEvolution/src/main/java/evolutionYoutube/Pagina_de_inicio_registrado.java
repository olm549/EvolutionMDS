package evolutionYoutube;


import java.util.List;

import database.BD_general;

public class Pagina_de_inicio_registrado extends Pagina_de_inicio_registrado_ventana {
	public Usuario_Registrado _unnamed_Usuario_Registrado_;
	public Lista_videos_relacionados _unnamed_Lista_videos_relacionados_;
	public Lista_videos_suscripciones _unnamed_Lista_videos_suscripciones_;
	public Pagina_de_inicio_registrado() {
		Inicio_Comun inicio = new Inicio_Comun();
		inicio.contenedorVideos.addComponent(new Lista_videos_suscripciones());
		inicio.contenedorMeGusta.addComponent(new Lista_videos_relacionados());
		inicioComun.addComponent(inicio);
		
		inicio.Cargar_Videos();
		BD_general bd = new BD_general();
		List listaSuscr = bd.Cargar_Videos_Suscripciones();
		List listaRel = bd.Cargar_Videos_Relacionados();
		
	}
}