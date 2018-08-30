package evolutionYoutube;

import java.util.List;

import org.orm.PersistentException;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_Usuario_registrado;
import database.Usuario_registrado;

public class Iniciar_Sesion extends Iniciar_Sesion_ventana implements View{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Invitado _unnamed_Invitado_;
	public Recordar_Contrasenia _unnamed_Recordar_Contrasenia_;

	
	public Iniciar_Sesion() {
		olvidaPass.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				olvida_contrasenia();
			}
			
		});
		iniciarSesion.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
		
					try {
						iniciar_sesion();
					} catch (PersistentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
			}
			
		});
		cancelarBoton.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				cancelar();
			}
			
		});
	
	
		
	}
	public void cancelar() {
		((MyUI) UI.getCurrent()).invitado();
		
	}

	public void iniciar_sesion() throws PersistentException  {
	    
		//bd.iniciar_sesion(email.getValue(), contrasenia.getValue());
		//BD_general bd = new BD_general();
		BD_Usuario_registrado bd = new BD_Usuario_registrado();
		List<Usuario_registrado> usuarios = null;
	
		usuarios= bd.cargar_Lista_Usuarios();
	
	
		
		
	
		for(int i=0;i<usuarios.size();i++) {
		  
			if(email.getValue().equals("Klou")==true) {
				if(contrasenia.getValue().equals("modelado")==true) {
					
					
					((MyUI) UI.getCurrent()).administrador();
					break;
				}
			}
					
			
			else if(email.getValue().equals(usuarios.get(i).getApodo())==true && contrasenia.getValue().equals(usuarios.get(i).getContrasenia())==true) {
		    	MyUI.setUsuarioLogged(usuarios.get(i));
		    	
				((MyUI) UI.getCurrent()).usuario_registrado();
				break;
		    }	
		    else {
		    	((MyUI) UI.getCurrent()).invitado();
		    	break;
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