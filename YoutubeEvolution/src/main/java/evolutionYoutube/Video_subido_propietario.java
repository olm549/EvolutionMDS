package evolutionYoutube;

import com.vaadin.server.ExternalResource;
import com.vaadin.ui.Button;
import com.vaadin.ui.Image;
import com.vaadin.ui.UI;
import com.vaadin.ui.Video;
import com.vaadin.ui.Button.ClickEvent;

import database.BD_general;
import database.Usuario_registrado;
import database.Videos;

public class Video_subido_propietario extends Video_subido_propietario_ventana {
	public Lista_videos_subidos _unnamed_Lista_videos_subidos_;
	public Visualizacion_video_creador _unnamed_Visualizacion_video_creador_;
	public Modificar_video _unnamed_Modificar_video_;
	public Image browser;

	
	public Video_subido_propietario(Videos vide) {
		reproducciones.setValue(""+vide.getNumVisualizaciones());
		titulo.setValue(vide.getTitulo());
		categorias.setValue(vide.getCategoria().getNombre()+"");
		etiquetas.setValue(vide.getEtiquetas());
		megusta.setValue(vide.usuarios_que_dan_me_gusta.size()+"");
		
		
		if(vide.getMiniatura() == null) {
			browser = new Image("",new ExternalResource("https://image.ibb.co/djBd5J/fondo.jpg"));
		}
		else{
			browser = new Image("",new ExternalResource(vide.getMiniatura()));
		}
		browser.setWidth("100%");
		miniatura.addComponent(browser);
		
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
	}
	/**public void editar_miniatura() {
		BD_general bd = new BD_general();
		bd.editar_Miniatura(1);//IDVIDEO
	}**/

	public void guardar_cambios() {
		
	}

	public void eliminar_video() {
		BD_general bd = new BD_general();
		bd.Eliminar_video(1);//IDVIDEO
	}
}