package evolutionYoutube;

import java.util.Vector;
//import evolutionYoutube.Usuario_Comentario;

import com.vaadin.navigator.View;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_Usuario extends Lista_Usuario_ventana implements View {
	public Lista_Usuarios _unnamed_Lista_Usuarios_;
	//public Vector<Usuario_Comentario> _unnamed_Usuario_Comentario_ = new Vector<Usuario_Comentario>();

	
	public Lista_Usuario() {
		vervideo.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Lista_Video_Usuario();
				
			}
			
		});
		vervideo1.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Lista_Video_Usuario();
				
			}
			
		});
		vervideo2.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Lista_Video_Usuario();
				
			}
			
		});
		vervideo3.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Lista_Video_Usuario();
				
			}
			
		});
	}
	public void buscar() {
		throw new UnsupportedOperationException();
	}
}