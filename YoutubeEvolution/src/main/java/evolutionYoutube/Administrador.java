package evolutionYoutube;

public class Administrador extends Administrador_ventana{
	public Inicio_Administrador _unnamed_Inicio_Administrador_;
	public Mi_perfil_Admin _unnamed_Mi_perfil_Admin_;
	public Cerrar_Sesion _unnamed_Cerrar_Sesion_;
	public Aniadir_Categoria _unnamed_Aniadir_Categoria_;
public Administrador() {
	cerrarSesion.addComponent(new Cerrar_Sesion());
	inicioComun.addComponent(new Inicio_Comun());
	
}


}