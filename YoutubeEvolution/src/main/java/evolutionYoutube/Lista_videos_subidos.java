package evolutionYoutube;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import database.BD_general;
import database.Videos;

import evolutionYoutube.Video_subido_propietario;

public class Lista_videos_subidos extends Lista_videos_subidos_ventana {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Videos_subidos _unnamed_Videos_subidos_;
	public Vector<Video_subido_propietario> _unnamed_Video_subido_propietario_ = new Vector<Video_subido_propietario>();

 
	public Lista_videos_subidos() {
		BD_general bd = new BD_general();
		List<Videos> vide = null;
	
        vide = bd.cargar_Videos_Subidos(MyUI.getUsuarioLogged().getID());
		
		
		
		
		System.out.println(vide);
		Arrays.toString(MyUI.getUsuarioLogged().video_subido.toArray());
		
		for(int i=0;i<vide.size();i++) {
			Video_subido_propietario videoo = new Video_subido_propietario(vide.get(i));
			videos.addComponent(videoo);
			videos.setSizeUndefined();
			
			
		}
		
		
	}
	


}