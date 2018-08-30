package evolutionYoutube;

import com.vaadin.ui.Button;
import com.vaadin.ui.UI;
import com.vaadin.ui.Button.ClickEvent;

public class Lista_de_listas extends Lista_de_listas_ventana{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Listas_de_reproduccion _unnamed_Listas_de_reproduccion_;
	public Listas_creadas _unnamed_Listas_creadas_;
	public Listas_fijas_reproduccion _unnamed_Listas_fijas_reproduccion_;
	
	public Lista_de_listas() {
		editar.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Editar_lista();
				
			}
			
		});
		editar1.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Editar_lista();
				
			}
			
		});
		editar2.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Editar_lista();
				
			}
			
		});
		editar3.addClickListener(new Button.ClickListener() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public void buttonClick(ClickEvent event) {
				((MyUI) UI.getCurrent()).Editar_lista();
				
			}
			
		});
		
		
	}
}