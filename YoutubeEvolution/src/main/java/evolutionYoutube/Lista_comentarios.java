package evolutionYoutube;

public class Lista_comentarios extends Lista_comentarios_ventana{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Lista_comentarios() {
		comentarios.addComponent(new Comentario());
	}
}