package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Vista_video_comun extends Vista_video_comun_ventana{
	public Buscador_videos _unnamed_Buscador_videos_;
	public Ver_video _unnamed_Ver_video_;

	public Vista_video_comun() {
		volver.addClickListener(new Button.ClickListener() {
			
			@Override
			public void buttonClick(ClickEvent event) {
				volver();
				
			}
		});
	}
	
	public void usuario() {
		
		((MyUI) UI.getCurrent()).ver_perfil_usuario();
	}

	public void volver() {
		
		((MyUI) UI.getCurrent()).invitado();
	}

	public void ver_etiquetas() {
		throw new UnsupportedOperationException();
	}

	public void visualizar_pantalla_completa() {
		throw new UnsupportedOperationException();
	}
}