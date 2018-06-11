package evolutionYoutube;

import database.BD_general;

public class Menu_videos extends Menu_videos_ventana {
	public Inicio_Comun _unnamed_Inicio_Comun_;
	public Lista_Categorias _unnamed_Lista_Categorias_;
	public Buscador_videos _unnamed_Buscador_videos_;

	public void buscar() {
		BD_general bd = new BD_general();
		bd.buscar(texto.getCaption(), tipoB.getCaption());
	}
}