package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;
import database.Usuario_Administrador;

import com.vaadin.ui.Button.ClickEvent;

public class Datos_personales extends Datos_personales_ventana{
	public Mi_cuenta _unnamed_Mi_cuenta_;
	public Modificar_datos_personales _unnamed_Modificar_datos_personales_;

	
	public Datos_personales() {
		modificar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).modificar_datos_personales();
				
			}
			
		});
		BD_general bd = new BD_general();
		Usuario_Administrador admin= bd.cargar_datos_admin(MyUI.getUsuarioLogged().getID());
	    nombre.setValue(""+admin.getNombre());
		apellido.setValue(""+admin.getApellido());
		apodo.setValue(""+admin.getApodo());
		email.setValue(""+admin.getEmail());
		contrasenia.setValue(""+admin.getContrasenia());
		
	}
	public void editar_avatar() {
		throw new UnsupportedOperationException();
	}
}