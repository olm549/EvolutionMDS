package database;
import java.util.List;
public interface IAdministrador {

	public void Eliminar_video(int aID);

	public void crear_categoria(String aNombre, String aContrasenia, int aEdad, String aImagen, boolean aConfirmacion);

	public List cargar_Lista_De_Categorias();

	public void eliminar_categoria(int aId_categoria);

	public List cargar_Lista_Usuarios();

	public void editar_Categoria(String aNombre_categoria, String aIcono_categoria, int aEdad_categoria);

	public Usuario_Administrador cargar_datos_admin(int aID_Admin);

	public void modificar_datos(String aNombre, String aApellido, String aApodo, String aAnio, String aEmail, String aContrasenia);

	public void eliminar_Usuario(int aIDUsuario);
}