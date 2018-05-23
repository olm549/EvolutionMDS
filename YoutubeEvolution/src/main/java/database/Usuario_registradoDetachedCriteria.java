/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: OLM(University of Almeria)
 * License Type: Academic
 */
package database;

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Usuario_registradoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nombre;
	public final StringExpression apellido;
	public final StringExpression email;
	public final StringExpression contrasenia;
	public final StringExpression apodo;
	public final IntegerExpression id_Usuario_registrado;
	public final StringExpression anio;
	public final StringExpression avatar;
	public final IntegerExpression numeroVisitas;
	public final IntegerExpression edad;
	public final IntegerExpression suscritoId;
	public final AssociationExpression suscrito;
	public final IntegerExpression suscribeId;
	public final AssociationExpression suscribe;
	public final IntegerExpression videos_que_gustanId;
	public final AssociationExpression videos_que_gustan;
	public final CollectionExpression comentarios;
	public final CollectionExpression suscripcion;
	public final CollectionExpression video_subido;
	public final CollectionExpression video_visualizado;
	public final CollectionExpression listas_de_reproduccion;
	public final CollectionExpression suscriptor;
	public final IntegerExpression historial_usuarioId;
	public final AssociationExpression historial_usuario;
	
	public Usuario_registradoDetachedCriteria() {
		super(database.Usuario_registrado.class, database.Usuario_registradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		id_Usuario_registrado = new IntegerExpression("id_Usuario_registrado", this.getDetachedCriteria());
		anio = new StringExpression("anio", this.getDetachedCriteria());
		avatar = new StringExpression("avatar", this.getDetachedCriteria());
		numeroVisitas = new IntegerExpression("numeroVisitas", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
		suscritoId = new IntegerExpression("suscrito.", this.getDetachedCriteria());
		suscrito = new AssociationExpression("suscrito", this.getDetachedCriteria());
		suscribeId = new IntegerExpression("suscribe.", this.getDetachedCriteria());
		suscribe = new AssociationExpression("suscribe", this.getDetachedCriteria());
		videos_que_gustanId = new IntegerExpression("videos_que_gustan.id_video", this.getDetachedCriteria());
		videos_que_gustan = new AssociationExpression("videos_que_gustan", this.getDetachedCriteria());
		comentarios = new CollectionExpression("ORM_comentarios", this.getDetachedCriteria());
		suscripcion = new CollectionExpression("ORM_suscripcion", this.getDetachedCriteria());
		video_subido = new CollectionExpression("ORM_video_subido", this.getDetachedCriteria());
		video_visualizado = new CollectionExpression("ORM_video_visualizado", this.getDetachedCriteria());
		listas_de_reproduccion = new CollectionExpression("ORM_listas_de_reproduccion", this.getDetachedCriteria());
		suscriptor = new CollectionExpression("ORM_suscriptor", this.getDetachedCriteria());
		historial_usuarioId = new IntegerExpression("historial_usuario.", this.getDetachedCriteria());
		historial_usuario = new AssociationExpression("historial_usuario", this.getDetachedCriteria());
	}
	
	public Usuario_registradoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, database.Usuario_registradoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		apellido = new StringExpression("apellido", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		contrasenia = new StringExpression("contrasenia", this.getDetachedCriteria());
		apodo = new StringExpression("apodo", this.getDetachedCriteria());
		id_Usuario_registrado = new IntegerExpression("id_Usuario_registrado", this.getDetachedCriteria());
		anio = new StringExpression("anio", this.getDetachedCriteria());
		avatar = new StringExpression("avatar", this.getDetachedCriteria());
		numeroVisitas = new IntegerExpression("numeroVisitas", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
		suscritoId = new IntegerExpression("suscrito.", this.getDetachedCriteria());
		suscrito = new AssociationExpression("suscrito", this.getDetachedCriteria());
		suscribeId = new IntegerExpression("suscribe.", this.getDetachedCriteria());
		suscribe = new AssociationExpression("suscribe", this.getDetachedCriteria());
		videos_que_gustanId = new IntegerExpression("videos_que_gustan.id_video", this.getDetachedCriteria());
		videos_que_gustan = new AssociationExpression("videos_que_gustan", this.getDetachedCriteria());
		comentarios = new CollectionExpression("ORM_comentarios", this.getDetachedCriteria());
		suscripcion = new CollectionExpression("ORM_suscripcion", this.getDetachedCriteria());
		video_subido = new CollectionExpression("ORM_video_subido", this.getDetachedCriteria());
		video_visualizado = new CollectionExpression("ORM_video_visualizado", this.getDetachedCriteria());
		listas_de_reproduccion = new CollectionExpression("ORM_listas_de_reproduccion", this.getDetachedCriteria());
		suscriptor = new CollectionExpression("ORM_suscriptor", this.getDetachedCriteria());
		historial_usuarioId = new IntegerExpression("historial_usuario.", this.getDetachedCriteria());
		historial_usuario = new AssociationExpression("historial_usuario", this.getDetachedCriteria());
	}
	
	public Usuario_registradoDetachedCriteria createSuscritoCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("suscrito"));
	}
	
	public Usuario_registradoDetachedCriteria createSuscribeCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("suscribe"));
	}
	
	public VideosDetachedCriteria createVideos_que_gustanCriteria() {
		return new VideosDetachedCriteria(createCriteria("videos_que_gustan"));
	}
	
	public ComentariosDetachedCriteria createComentariosCriteria() {
		return new ComentariosDetachedCriteria(createCriteria("ORM_comentarios"));
	}
	
	public Usuario_registradoDetachedCriteria createSuscripcionCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("ORM_suscripcion"));
	}
	
	public VideosDetachedCriteria createVideo_subidoCriteria() {
		return new VideosDetachedCriteria(createCriteria("ORM_video_subido"));
	}
	
	public VideosDetachedCriteria createVideo_visualizadoCriteria() {
		return new VideosDetachedCriteria(createCriteria("ORM_video_visualizado"));
	}
	
	public Listas_de_reproduccion2DetachedCriteria createListas_de_reproduccionCriteria() {
		return new Listas_de_reproduccion2DetachedCriteria(createCriteria("ORM_listas_de_reproduccion"));
	}
	
	public Usuario_registradoDetachedCriteria createSuscriptorCriteria() {
		return new Usuario_registradoDetachedCriteria(createCriteria("ORM_suscriptor"));
	}
	
	public Listas_de_reproduccion2DetachedCriteria createHistorial_usuarioCriteria() {
		return new Listas_de_reproduccion2DetachedCriteria(createCriteria("historial_usuario"));
	}
	
	public Usuario_registrado uniqueUsuario_registrado(PersistentSession session) {
		return (Usuario_registrado) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Usuario_registrado[] listUsuario_registrado(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Usuario_registrado[]) list.toArray(new Usuario_registrado[list.size()]);
	}
}

