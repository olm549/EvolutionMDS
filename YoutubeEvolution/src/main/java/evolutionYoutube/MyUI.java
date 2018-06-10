package evolutionYoutube;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Button;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of an HTML page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI implements View{

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	setNavigator(new Navigator(this, this));
    	getNavigator().addView("", new Invitado());
    }
    public void registrarse() {
    	getNavigator().addView("Registro", new Registrarse());
		getNavigator().navigateTo("Registro");
    }
    public void iniciar_sesion() {
    	getNavigator().addView("Iniciar Sesion", new Iniciar_Sesion());
		getNavigator().navigateTo("Iniciar Sesion");
	}
    public void invitado() {
    	getNavigator().addView("Invitado", new Invitado());
		getNavigator().navigateTo("Invitado");
	}
	public void usuario_registrado() {
    	getNavigator().addView("Usuario Registrado", new Usuario_Registrado());
		getNavigator().navigateTo("Usuario Registrado");
	}
	public void subir_video() {
    	getNavigator().addView("Subir video", new Subir_video());
		getNavigator().navigateTo("Subir video");
		
	}
	public void mi_perfil_registrado() {
    	getNavigator().addView("Mi perfil registrado", new Mi_cuenta());
		getNavigator().navigateTo("Mi perfil registrado");
	}
	public void aniadir_categoria() {
    	getNavigator().addView("Aniadir categoria", new Aniadir_Categoria());
		getNavigator().navigateTo("Aniadir categoria");
		
	}
	public void administrador() {
    	getNavigator().addView("Administrador", new Administrador());
		getNavigator().navigateTo("Administrador");
	}
	public void perfil_administrador() {
    	getNavigator().addView("Mi perfil Admin", new Mi_perfil_Admin());
		getNavigator().navigateTo("Mi perfil Admin");
		
	}
	
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }

	public void recordarContrasenia() {

    	getNavigator().addView("Recordar Contrasenia", new Recordar_Contrasenia());
		getNavigator().navigateTo("Recordar Contrasenia");
		
	}
	public void ver_perfil_usuario() {
    	getNavigator().addView("Ver_perfil_usuario", new Ver_perfil_usuario());
		getNavigator().navigateTo("Ver_perfil_usuario");		
		
	}
	
	

	
}
