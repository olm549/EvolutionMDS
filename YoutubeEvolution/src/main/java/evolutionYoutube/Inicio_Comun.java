package evolutionYoutube;

import java.util.ArrayList;
import java.util.List;

import database.BD_general;

public class Inicio_Comun extends Inicio_comun_ventana{
	public Invitado _unnamed_Invitado_;
	public Videos_con_mas_megusta videos_con_mas_megusta;
	public Ultimos_videos ultimos_videos;
	public Menu_videos _unnamed_Menu_videos_;
	public Buscador_videos _unnamed_Buscador_videos_;

	
public Inicio_Comun() {
	Cargar_Videos();
	contenedorMeGusta.addComponent(videos_con_mas_megusta);
	contenedorUltimosVideos.addComponent(ultimos_videos);
	menuVideos.addComponent(new Menu_videos_ventana());
}
	public void Cargar_Videos() {
		BD_general bd = new BD_general();
		List listaMeGusta = bd.Cargar_Videos_Megusta();
		videos_con_mas_megusta = new Videos_con_mas_megusta(listaMeGusta);
		List listaRecientes = bd.Cargar_Videos_Recientes();
		ultimos_videos = new Ultimos_videos(listaRecientes);
		/**
		 * for(Video video : listaMeGusta){
		 * 	Video temp = new Video();
		 * 	temp.setNombre(video.getNombre())
		 * temp.setVisu(video.getVisu())
		 * temp.setMiniatura(video.getMiniatura())
		 * addComponent(video);
		 * 
		 * }
		 */
	}
}