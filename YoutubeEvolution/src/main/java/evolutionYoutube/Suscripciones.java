package evolutionYoutube;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Suscripciones extends Suscripciones_ventana implements View {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Mi_perfil _unnamed_Mi_perfil_;
	public Lista_Suscriptores _unnamed_Lista_Suscriptores_;
	public Lista_Seguidores _unnamed_Lista_Seguidores_;

	public Suscripciones() {
		
		seguidores.addComponent(new Lista_Seguidores_Suscriptores_ventana());
		principal.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).usuario_registrado();
				
			}
			
		});
		micuenta.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mi_perfil_registrado();
				
			}
			
		});
		videos_subidos.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).videos_subidos();
				
			}
			
		});
		mis_listas.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).mis_listas();
				
			}
			
		});
		suscripciones.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).suscripciones();
				
			}
			
		});
		
	}
	public void ver_perfil() {
		throw new UnsupportedOperationException();
	}

	public void dejar_de_seguir() {
		//BD_general bd = new BD_general();
		//bd.dejar_de_seguir(1);//USUARIO
	}
}