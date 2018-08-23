package evolutionYoutube;

import java.util.ArrayList;
import java.util.List;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Image;

import database.BD_general;

public class Inicio_Comun extends Inicio_comun_ventana{
	public Invitado _unnamed_Invitado_;
	public Videos_con_mas_megusta videos_con_mas_megusta;
	public Ultimos_videos ultimos_videos;
	public Menu_videos menu_videos;
	public Buscador_videos _unnamed_Buscador_videos_;

	
public Inicio_Comun() {
	//Cargar_Videos();
	contenedorMeGusta.addComponent(new Videos_con_mas_megusta());
	contenedorUltimosVideos.addComponent(new Ultimos_videos());
	this.menu_videos= new Menu_videos();
	menuVideos.addComponent(this.menu_videos);
	
}


	/**public void Cargar_Videos() {
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
	//}
}