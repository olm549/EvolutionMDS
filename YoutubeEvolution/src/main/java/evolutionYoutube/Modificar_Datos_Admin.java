package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_general;

import com.vaadin.ui.Button.ClickEvent;

public class Modificar_Datos_Admin extends Modificar_Datos_Admin_ventana implements View {
	//public Mi_cuenta_admin _unnamed_Mi_cuenta_admin_;
	public Datos_Admin _unnamed_Mi_cuenta_admin_;

	
	public Modificar_Datos_Admin() {
		guardar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				guardar();
				((MyUI) UI.getCurrent()).Mi_perfil_Admin();
				
			}
			
		});
	    cancelar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Mi_perfil_Admin();
				
			}
			
		});
	    nombre.setValue(MyUI.getUsuarioLogged().getNombre());
	    apellido.setValue(MyUI.getUsuarioLogged().getApellido());
	    apodo.setValue(MyUI.getUsuarioLogged().getApodo());
	    email.setValue(MyUI.getUsuarioLogged().getEmail());
	    contrasenia.setValue(MyUI.getUsuarioLogged().getContrasenia());
	    repetircontrasenia.setValue(MyUI.getUsuarioLogged().getContrasenia());
	}
	public void guardar() {
		BD_general bd = new BD_general();
		bd.modificar_datosAdmin(MyUI.getUsuarioLogged().getID(),nombre.getValue(),apellido.getValue(), apodo.getValue(), "2018", email.getValue(), contrasenia.getValue());
	}

	
}