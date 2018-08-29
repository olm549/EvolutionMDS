package evolutionYoutube;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.shared.ui.ValueChangeMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_Usuario_administrador;
import database.BD_Usuario_registrado;
import database.BD_general;
import database.Usuario_Administrador;
import database.Usuario_registrado;
import database.Usuarios;

public class Iniciar_Sesion extends Iniciar_Sesion_ventana implements View{
	public Invitado _unnamed_Invitado_;
	public Recordar_Contrasenia _unnamed_Recordar_Contrasenia_;

	
	public Iniciar_Sesion() {
		olvidaPass.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				olvida_contrasenia();
			}
			
		});
		iniciarSesion.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
		
					iniciar_sesion();
				
			}
			
		});
		cancelarBoton.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				cancelar();
			}
			
		});
	
	
		
	}
	public void cancelar() {
		((MyUI) UI.getCurrent()).invitado();
		
	}

	public void iniciar_sesion()  {
	    
		//bd.iniciar_sesion(email.getValue(), contrasenia.getValue());
		//BD_general bd = new BD_general();
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		List<Usuario_registrado> usuarios = null;
		try {
			usuarios= bd.cargar_Lista_Usuarios();
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		for(int i=0;i<usuarios.size();i++) {
		  
			if(email.getValue().equals("Klou")==true) {
				if(contrasenia.getValue().equals("modelado")==true) {
					
					
					((MyUI) UI.getCurrent()).administrador();
				}
			}
					
			
		    else if(email.getValue().equals(usuarios.get(i).getEmail())==true && contrasenia.getValue().equals(usuarios.get(i).getContrasenia())==true) {
		    	MyUI.setUsuarioLogged(usuarios.get(i));
				((MyUI) UI.getCurrent()).usuario_registrado();
		    }	
		    else {
		    	((MyUI) UI.getCurrent()).invitado();
		    }
			
		}
		   
			
		//}
		//ESTO VA EN LA BD
		//((MyUI) UI.getCurrent()).usuario_registrado();

		//((MyUI) UI.getCurrent()).administrador();
		//
		//((MyUI) UI.getCurrent()).invitado();
		//((MyUI) UI.getCurrent()).ver_perfil_usuario();
	}

	public void olvida_contrasenia() {
		((MyUI) UI.getCurrent()).recordarContrasenia();		
	}
}