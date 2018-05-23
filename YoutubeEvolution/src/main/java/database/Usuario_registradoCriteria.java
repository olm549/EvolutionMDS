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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class Usuario_registradoCriteria extends AbstractORMCriteria {
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
	
	public Usuario_registradoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nombre = new StringExpression("nombre", this);
		apellido = new StringExpression("apellido", this);
		email = new StringExpression("email", this);
		contrasenia = new StringExpression("contrasenia", this);
		apodo = new StringExpression("apodo", this);
		id_Usuario_registrado = new IntegerExpression("id_Usuario_registrado", this);
		anio = new StringExpression("anio", this);
		avatar = new StringExpression("avatar", this);
		numeroVisitas = new IntegerExpression("numeroVisitas", this);
		edad = new IntegerExpression("edad", this);
		suscritoId = new IntegerExpression("suscrito.", this);
		suscrito = new AssociationExpression("suscrito", this);
		suscribeId = new IntegerExpression("suscribe.", this);
		suscribe = new AssociationExpression("suscribe", this);
		videos_que_gustanId = new IntegerExpression("videos_que_gustan.id_video", this);
		videos_que_gustan = new AssociationExpression("videos_que_gustan", this);
		comentarios = new CollectionExpression("ORM_comentarios", this);
		suscripcion = new CollectionExpression("ORM_suscripcion", this);
		video_subido = new CollectionExpression("ORM_video_subido", this);
		video_visualizado = new CollectionExpression("ORM_video_visualizado", this);
		listas_de_reproduccion = new CollectionExpression("ORM_listas_de_reproduccion", this);
		suscriptor = new CollectionExpression("ORM_suscriptor", this);
		historial_usuarioId = new IntegerExpression("historial_usuario.", this);
		historial_usuario = new AssociationExpression("historial_usuario", this);
	}
	
	public Usuario_registradoCriteria(PersistentSession session) {
		this(session.createCriteria(Usuario_registrado.class));
	}
	
	public Usuario_registradoCriteria() throws PersistentException {
		this(ProyectoMDSPersistentManager.instance().getSession());
	}
	
	public Usuario_registradoCriteria createSuscritoCriteria() {
		return new Usuario_registradoCriteria(createCriteria("suscrito"));
	}
	
	public Usuario_registradoCriteria createSuscribeCriteria() {
		return new Usuario_registradoCriteria(createCriteria("suscribe"));
	}
	
	public VideosCriteria createVideos_que_gustanCriteria() {
		return new VideosCriteria(createCriteria("videos_que_gustan"));
	}
	
	public ComentariosCriteria createComentariosCriteria() {
		return new ComentariosCriteria(createCriteria("ORM_comentarios"));
	}
	
	public Usuario_registradoCriteria createSuscripcionCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_suscripcion"));
	}
	
	public VideosCriteria createVideo_subidoCriteria() {
		return new VideosCriteria(createCriteria("ORM_video_subido"));
	}
	
	public VideosCriteria createVideo_visualizadoCriteria() {
		return new VideosCriteria(createCriteria("ORM_video_visualizado"));
	}
	
	public Listas_de_reproduccion2Criteria createListas_de_reproduccionCriteria() {
		return new Listas_de_reproduccion2Criteria(createCriteria("ORM_listas_de_reproduccion"));
	}
	
	public Usuario_registradoCriteria createSuscriptorCriteria() {
		return new Usuario_registradoCriteria(createCriteria("ORM_suscriptor"));
	}
	
	public Listas_de_reproduccion2Criteria createHistorial_usuarioCriteria() {
		return new Listas_de_reproduccion2Criteria(createCriteria("historial_usuario"));
	}
	
	public Usuario_registrado uniqueUsuario_registrado() {
		return (Usuario_registrado) super.uniqueResult();
	}
	
	public Usuario_registrado[] listUsuario_registrado() {
		java.util.List list = super.list();
		return (Usuario_registrado[]) list.toArray(new Usuario_registrado[list.size()]);
	}
}

