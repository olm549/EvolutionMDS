package evolutionYoutube;

import database.BD_general;

public class Suscribirse extends Suscribirse_invitado {
	public Vista_perfil_Registrado _unnamed_Vista_perfil_Registrado_;

	public void suscribirse() {
		BD_general bd = new BD_general();
		bd.suscribirse(1,1);//IDUSUARIO
	}
}