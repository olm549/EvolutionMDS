package evolutionYoutube;

import java.util.Vector;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

//import evolutionYoutube.Video_subido_propietario;

public class Lista_videos_subidos extends Lista_videos_subidos_ventana {
	public Videos_subidos _unnamed_Videos_subidos_;
	//public Vector<Video_subido_propietario> _unnamed_Video_subido_propietario_ = new Vector<Video_subido_propietario>();

 
	public Lista_videos_subidos() {
		modificar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).modificar_video();
				
			}
			
		});
		eliminar.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				eliminar();
				
			}

			private void eliminar() {
				// TODO Auto-generated method stub
				
			}

			
		});
		eliminar2.addClickListener(new Button.ClickListener() {

			@Override
			public void buttonClick(ClickEvent event) {
				eliminar2();
				
			}

			private void eliminar2() {
				// TODO Auto-generated method stub
				
			}

		});
		
	}
	


}