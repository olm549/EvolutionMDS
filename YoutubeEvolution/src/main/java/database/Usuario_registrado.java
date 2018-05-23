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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Usuario_registrado")
@Inheritance(strategy=InheritanceType.JOINED)
@PrimaryKeyJoinColumn(name="UsuariosID", referencedColumnName="ID")
public class Usuario_registrado extends database.Usuarios implements Serializable {
	public Usuario_registrado() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADO_COMENTARIOS) {
			return ORM_comentarios;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRIPCION) {
			return ORM_suscripcion;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_VIDEO_SUBIDO) {
			return ORM_video_subido;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_VIDEO_VISUALIZADO) {
			return ORM_video_visualizado;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_LISTAS_DE_REPRODUCCION) {
			return ORM_listas_de_reproduccion;
		}
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRIPTOR) {
			return ORM_suscriptor;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_USUARIO_REGISTRADO_VIDEOS_QUE_GUSTAN) {
			this.videos_que_gustan = (database.Videos) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRITO) {
			this.suscrito = (database.Usuario_registrado) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRIBE) {
			this.suscribe = (database.Usuario_registrado) owner;
		}
		
		else if (key == ORMConstants.KEY_USUARIO_REGISTRADO_HISTORIAL_USUARIO) {
			this.historial_usuario = (database.Listas_de_reproduccion2) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="Id_Usuario_registrado", nullable=false, length=10)	
	private int id_Usuario_registrado;
	
	@Column(name="Anio", nullable=true, length=255)	
	private String anio;
	
	@Column(name="Avatar", nullable=true, length=255)	
	private String avatar;
	
	@Column(name="NumeroVisitas", nullable=false, length=10)	
	private int numeroVisitas;
	
	@Column(name="Edad", nullable=false, length=10)	
	private int edad;
	
	@ManyToOne(targetEntity=database.Usuario_registrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Usuario_registradoUsuariosID2", referencedColumnName="UsuariosID", nullable=false) })	
	private database.Usuario_registrado suscrito;
	
	@ManyToOne(targetEntity=database.Usuario_registrado.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="Usuario_registradoUsuariosID", referencedColumnName="UsuariosID", nullable=false) })	
	private database.Usuario_registrado suscribe;
	
	@ManyToOne(targetEntity=database.Videos.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="VideosId_video", referencedColumnName="Id_video", nullable=false) })	
	private database.Videos videos_que_gustan;
	
	@OneToMany(mappedBy="usuarios_que_comentan", targetEntity=database.Comentarios.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_comentarios = new java.util.HashSet();
	
	@OneToMany(mappedBy="suscribe", targetEntity=database.Usuario_registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_suscripcion = new java.util.HashSet();
	
	@OneToMany(mappedBy="autor", targetEntity=database.Videos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_video_subido = new java.util.HashSet();
	
	@ManyToMany(targetEntity=database.Videos.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="Videos_Usuario_registrado", joinColumns={ @JoinColumn(name="Usuario_registradoUsuariosID") }, inverseJoinColumns={ @JoinColumn(name="VideosId_video") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_video_visualizado = new java.util.HashSet();
	
	@OneToMany(mappedBy="usuario_registrado", targetEntity=database.Listas_de_reproduccion2.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_listas_de_reproduccion = new java.util.HashSet();
	
	@OneToMany(mappedBy="suscrito", targetEntity=database.Usuario_registrado.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_suscriptor = new java.util.HashSet();
	
	@OneToOne(mappedBy="usuario_que_consulta_historial", targetEntity=database.Listas_de_reproduccion2.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private database.Listas_de_reproduccion2 historial_usuario;
	
	public void setId_Usuario_registrado(int value) {
		this.id_Usuario_registrado = value;
	}
	
	public int getId_Usuario_registrado() {
		return id_Usuario_registrado;
	}
	
	public void setAnio(String value) {
		this.anio = value;
	}
	
	public String getAnio() {
		return anio;
	}
	
	public void setAvatar(String value) {
		this.avatar = value;
	}
	
	public String getAvatar() {
		return avatar;
	}
	
	public void setNumeroVisitas(int value) {
		this.numeroVisitas = value;
	}
	
	public int getNumeroVisitas() {
		return numeroVisitas;
	}
	
	public void setEdad(int value) {
		this.edad = value;
	}
	
	public int getEdad() {
		return edad;
	}
	
	private void setORM_Comentarios(java.util.Set value) {
		this.ORM_comentarios = value;
	}
	
	private java.util.Set getORM_Comentarios() {
		return ORM_comentarios;
	}
	
	@Transient	
	public final database.ComentariosSetCollection comentarios = new database.ComentariosSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_COMENTARIOS, ORMConstants.KEY_COMENTARIOS_USUARIOS_QUE_COMENTAN, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setVideos_que_gustan(database.Videos value) {
		if (videos_que_gustan != null) {
			videos_que_gustan.usuarios_que_dan_me_gusta.remove(this);
		}
		if (value != null) {
			value.usuarios_que_dan_me_gusta.add(this);
		}
	}
	
	public database.Videos getVideos_que_gustan() {
		return videos_que_gustan;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Videos_que_gustan(database.Videos value) {
		this.videos_que_gustan = value;
	}
	
	private database.Videos getORM_Videos_que_gustan() {
		return videos_que_gustan;
	}
	
	private void setORM_Suscripcion(java.util.Set value) {
		this.ORM_suscripcion = value;
	}
	
	private java.util.Set getORM_Suscripcion() {
		return ORM_suscripcion;
	}
	
	@Transient	
	public final database.Usuario_registradoSetCollection suscripcion = new database.Usuario_registradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRIPCION, ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRIBE, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Video_subido(java.util.Set value) {
		this.ORM_video_subido = value;
	}
	
	private java.util.Set getORM_Video_subido() {
		return ORM_video_subido;
	}
	
	@Transient	
	public final database.VideosSetCollection video_subido = new database.VideosSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_VIDEO_SUBIDO, ORMConstants.KEY_VIDEOS_AUTOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setSuscrito(database.Usuario_registrado value) {
		if (suscrito != null) {
			suscrito.suscriptor.remove(this);
		}
		if (value != null) {
			value.suscriptor.add(this);
		}
	}
	
	public database.Usuario_registrado getSuscrito() {
		return suscrito;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Suscrito(database.Usuario_registrado value) {
		this.suscrito = value;
	}
	
	private database.Usuario_registrado getORM_Suscrito() {
		return suscrito;
	}
	
	private void setORM_Video_visualizado(java.util.Set value) {
		this.ORM_video_visualizado = value;
	}
	
	private java.util.Set getORM_Video_visualizado() {
		return ORM_video_visualizado;
	}
	
	@Transient	
	public final database.VideosSetCollection video_visualizado = new database.VideosSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_VIDEO_VISUALIZADO, ORMConstants.KEY_VIDEOS_USUARIO_VISUALIZADOR, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	private void setORM_Listas_de_reproduccion(java.util.Set value) {
		this.ORM_listas_de_reproduccion = value;
	}
	
	private java.util.Set getORM_Listas_de_reproduccion() {
		return ORM_listas_de_reproduccion;
	}
	
	@Transient	
	public final database.Listas_de_reproduccion2SetCollection listas_de_reproduccion = new database.Listas_de_reproduccion2SetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_LISTAS_DE_REPRODUCCION, ORMConstants.KEY_LISTAS_DE_REPRODUCCION2_USUARIO_REGISTRADO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setSuscribe(database.Usuario_registrado value) {
		if (suscribe != null) {
			suscribe.suscripcion.remove(this);
		}
		if (value != null) {
			value.suscripcion.add(this);
		}
	}
	
	public database.Usuario_registrado getSuscribe() {
		return suscribe;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Suscribe(database.Usuario_registrado value) {
		this.suscribe = value;
	}
	
	private database.Usuario_registrado getORM_Suscribe() {
		return suscribe;
	}
	
	private void setORM_Suscriptor(java.util.Set value) {
		this.ORM_suscriptor = value;
	}
	
	private java.util.Set getORM_Suscriptor() {
		return ORM_suscriptor;
	}
	
	@Transient	
	public final database.Usuario_registradoSetCollection suscriptor = new database.Usuario_registradoSetCollection(this, _ormAdapter, ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRIPTOR, ORMConstants.KEY_USUARIO_REGISTRADO_SUSCRITO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public void setHistorial_usuario(database.Listas_de_reproduccion2 value) {
		if (this.historial_usuario != value) {
			database.Listas_de_reproduccion2 lhistorial_usuario = this.historial_usuario;
			this.historial_usuario = value;
			if (value != null) {
				historial_usuario.setUsuario_que_consulta_historial(this);
			}
			if (lhistorial_usuario != null && lhistorial_usuario.getUsuario_que_consulta_historial() == this) {
				lhistorial_usuario.setUsuario_que_consulta_historial(null);
			}
		}
	}
	
	public database.Listas_de_reproduccion2 getHistorial_usuario() {
		return historial_usuario;
	}
	
	public String toString() {
		return super.toString();
	}
	
}
