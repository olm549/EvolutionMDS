package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Window;

public class Invitado extends Invitado_ventana{
	public Registrarse _unnamed_Registrarse_;
	public Iniciar_Sesion _unnamed_Iniciar_Sesion_;
	public Inicio_Comun _unnamed_Inicio_Comun_;
	
	public Invitado() {
		inicioComun.addComponent(new Inicio_Comun());
		registrarse.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				Registrarse registro = new Registrarse();
				Window ventana = new Window();
				ventana.setVisible(true);
				ventana.setEnabled(true);
				ventana.attach();
				ventana.setContent(registro);
				
			}
			
		});
		
	}
}