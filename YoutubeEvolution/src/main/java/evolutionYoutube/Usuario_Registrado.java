package evolutionYoutube;

public class Usuario_Registrado extends Usuario_Registrado_ventana{
	public Cerrar_Sesion _unnamed_Cerrar_Sesion_;
	public Pagina_de_inicio_registrado _unnamed_Pagina_de_inicio_registrado_;
	public Vista_perfil_Registrado _unnamed_Vista_perfil_Registrado_;
	public Mi_perfil _unnamed_Mi_perfil_;
	public Subir_video _unnamed_Subir_video_;
	
	public Usuario_Registrado() {
		paginaInicio.addComponent(new Pagina_de_inicio_registrado());
		cerrarSesion.addComponent(new Cerrar_Sesion());
	}
}