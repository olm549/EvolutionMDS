package evolutionYoutube;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;

import database.BD_Usuario_registrado;
import database.BD_general;

import com.vaadin.ui.Button.ClickEvent;

public class Registrarse extends Registrarse_ventana implements View{
	public Invitado _unnamed_Invitado_;
	//public Enviar_Correo_Electronico _enviar_Correo_Electronico;

	
	public Registrarse() {
		registrarseBoton.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				registrarse();
				
			}
			
		});
		cancelarBoton.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				cancelar();
				
			}
			
		});
	}
	
	
	public void registrarse() {
		/*METODO QUE SE REGISTRA, CREA UNA BD GENERAL SIEMPRE PARA LLAMAR AL METODO DE LA INTERFAZ,
		*QUE A SU VEZ LLAMA AL METODO DE bd_especifica QUE SERA EL QUE REALICE LA ACCION
		*DE REGISTRARSE
		*/
		BD_general bd = new BD_general();
		if(!(contrasenia.getCaption().equals(confirmar.getCaption())))return;
		try {
			bd.Registrarse(nombre.getValue(), apellidos.getValue(), apodo.getValue(), 
					Integer.valueOf(edad.getValue()), email.getValue(), contrasenia.getValue(), confirmar.getValue());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		((MyUI) UI.getCurrent()).invitado();
	}

	public void cancelar() {
		((MyUI) UI.getCurrent()).invitado();
	}
}