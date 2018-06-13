package evolutionYoutube;
import evolutionYoutube.Usuario_busqueda;
//import evolutionYoutube.Usuario_Comentario;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.Component;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

import evolutionYoutube.Lista_Seguidores;
import evolutionYoutube.Lista_Suscriptores;
import evolutionYoutube.Suscribirse_invitado;
import evolutionYoutube.Listas_creadas;

public class Ver_perfil_usuario extends Ver_perfil_usuario_ventana implements View{
	public Usuario_busqueda _unnamed_Usuario_busqueda_;
	//public Usuario_Comentario _unnamed_Usuario_Comentario_;
	public Lista_Seguidores _unnamed_Lista_Seguidores_;
	public Lista_Suscriptores _unnamed_Lista_Suscriptores_;
	public Suscribirse_invitado _unnamed_Suscribirse_invitado_;
	public Listas_creadas _unnamed_Listas_creadas_;

	
	public Ver_perfil_usuario() {
			
			listas_reproduccion.addComponent(new Listas_creadas());
			suscripciones.addComponent(new Lista_Suscriptores());
			seguidores.addComponent(new Lista_Seguidores());
			
			volver.addClickListener(new Button.ClickListener() {

				@Override
				public void buttonClick(ClickEvent event) {
					((MyUI) UI.getCurrent()).invitado();
				}
				
			});
		
	}
	
	public void volver() {
		((MyUI) UI.getCurrent()).usuario_registrado();
	}
}