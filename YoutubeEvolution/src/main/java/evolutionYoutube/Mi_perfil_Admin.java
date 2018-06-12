package evolutionYoutube;

import com.vaadin.navigator.View;

public class Mi_perfil_Admin extends Mi_perfil_Admin_ventana implements View{
	public Administrador _unnamed_Administrador_;
	public Mi_cuenta_admin _unnamed_Mi_cuenta_admin_;
	public Categorias _unnamed_Categorias_;
	public Lista_Usuarios _unnamed_Lista_Usuarios_;
	
	
	public Mi_perfil_Admin() {
		menu.addComponent(new Menu_admin());
		mi_cuenta.addComponent(new Datos_Admin());
	}

	public void cerrar_sesion() {
		throw new UnsupportedOperationException();
	}
}