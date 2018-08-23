package evolutionYoutube;

import java.util.List;

import com.vaadin.server.ClassResource;
import com.vaadin.server.ExternalResource;
import com.vaadin.ui.BrowserFrame;
import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Component;
import com.vaadin.ui.Image;

import database.BD_general;

public class Menu_videos extends Menu_videos_ventana {
	public Inicio_Comun _unnamed_Inicio_Comun_;
	public Lista_Categorias _unnamed_Lista_Categorias_;
	public Buscador_videos _unnamed_Buscador_videos_;
	

	public Menu_videos() {
		crearIconos();
	

	}
	private void crearIconos() {
		BD_general bd= new BD_general();
	    List<database.Categorias> categorias = bd.Cargar_Categorias();
	    
		for(database.Categorias cat: categorias){
			  
			    
				Image browser = new Image("",new ExternalResource(cat.getIcono()));
			    browser.setHeight("30px");
			    categoria.addComponent(browser);	    
			    
		}
	

	}

	public void buscar() {
		BD_general bd = new BD_general();
		bd.buscar(texto.getCaption(), tipoB.getCaption());
	}
	
	
	
	
}
	