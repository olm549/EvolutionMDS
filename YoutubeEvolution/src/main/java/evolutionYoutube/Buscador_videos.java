package evolutionYoutube;

public class Buscador_videos extends Buscador_videos_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Inicio_Comun _unnamed_Inicio_Comun_;
	public Menu_videos _unnamed_Menu_videos_;
	public Listado_busqueda _unnamed_Listado_busqueda_;
	public Vista_video_comun _unnamed_Vista_video_comun_;
	public Ordenar_videos _unnamed_Ordenar_videos_;
	
	public Buscador_videos() {
		//DEPENDE SI BUSCA VIDEOS O USUARIOS 
		this.panel.addComponent(new Usuario_busqueda());
		this.panel.addComponent(new Video_busqueda());
		
	}
}