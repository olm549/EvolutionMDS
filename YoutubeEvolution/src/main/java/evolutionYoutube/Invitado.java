package evolutionYoutube;

public class Invitado extends Invitado_ventana{
	public Registrarse _unnamed_Registrarse_;
	public Iniciar_Sesion _unnamed_Iniciar_Sesion_;
	public Inicio_Comun _unnamed_Inicio_Comun_;
	
	public Invitado() {
		inicioComun.addComponent(new Inicio_Comun());
		
	}
}