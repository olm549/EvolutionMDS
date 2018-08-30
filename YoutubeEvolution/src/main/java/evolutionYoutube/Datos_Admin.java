package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Image;

import database.BD_general;
import database.Usuario_Administrador;

public class Datos_Admin extends Datos_Admin_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//public Mi_cuenta_admin _unnamed_Mi_cuenta_admin_;
	public Mi_perfil_Admin _unnamed_Mi_cuenta_admin_;

	
	public Datos_Admin() {
		modificar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).modificar_datos_Admin();
				
			}
			
		});
		editaravatar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				editar_avatar();
				((MyUI) UI.getCurrent()).Mi_perfil_Admin();
				
			}
			
		});
		
		BD_general bd = new BD_general();
		Usuario_Administrador admin= bd.cargar_datos_admin(1);
	    nombre.setValue(""+admin.getNombre());
		apellido.setValue(""+admin.getApellido());
		apodo.setValue(""+admin.getApodo());
		email.setValue(""+admin.getEmail());
		contrasenia.setValue(""+admin.getContrasenia());
		
	    
		
	}
	public void editar_avatar() {
		avatar = new Image(url.getValue());
	}
}