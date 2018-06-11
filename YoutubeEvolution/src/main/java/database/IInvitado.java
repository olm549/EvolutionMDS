package database;
import java.util.List;
import evolutionYoutube.Etiqueta;

public interface IInvitado {

	public List Cargar_Videos_Megusta();

	public List Cargar_Videos_Recientes();

	public List Cargar_Categorias();

	public List ver_etiquetas();

	public void recuperar_contrasenia(String aEmail);

	public List buscar(String aTexto, String aTipo);

	public void iniciar_sesion(String aEmail, String aContrasenia);
}