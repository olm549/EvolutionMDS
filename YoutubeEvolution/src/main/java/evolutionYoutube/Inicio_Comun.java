package evolutionYoutube;

import java.util.ArrayList;
import java.util.List;

import database.BD_general;

public class Inicio_Comun extends Inicio_comun_ventana{
	public Invitado _unnamed_Invitado_;
	public Videos_con_mas_megusta _unnamed_Videos_con_mas_megusta_;
	public Ultimos_videos _unnamed_Ultimos_videos_;
	public Menu_videos _unnamed_Menu_videos_;
	public Buscador_videos _unnamed_Buscador_videos_;

	
public Inicio_Comun() {
	contenedorMeGusta.addComponent(new Videos_con_mas_megusta());
	contenedorUltimosVideos.addComponent(new Ultimos_videos());
	menuVideos.addComponent(new Menu_videos_ventana());
}
	public void Cargar_Videos() {
		BD_general bd = new BD_general();
		List listaMeGusta = bd.Cargar_Videos_Megusta();
		List listaRecientes = bd.Cargar_Videos_Recientes();
	}
}