package evolutionYoutube;

import java.util.List;

public class Videos_con_mas_megusta extends Videos_con_mas_megusta_ventana {
	public Inicio_Comun _unnamed_Inicio_Comun_;
	
	public Videos_con_mas_megusta() {
		
	}
	
	public Videos_con_mas_megusta(List lista) {
		for(int i = 0 ; i<lista.size(); i++) {
			videosMeGusta.addComponent(new Lista_videos(lista.get(i)));
		}
	}
}