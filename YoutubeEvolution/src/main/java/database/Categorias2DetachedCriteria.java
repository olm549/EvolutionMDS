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

public class Categorias2DetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression id_categoria;
	public final StringExpression nombre;
	public final IntegerExpression edad;
	public final StringExpression icono;
	public final CollectionExpression videos;
	
	public Categorias2DetachedCriteria() {
		super(database.Categorias2.class, database.Categorias2Criteria.class);
		id_categoria = new IntegerExpression("id_categoria", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
		icono = new StringExpression("icono", this.getDetachedCriteria());
		videos = new CollectionExpression("ORM_videos", this.getDetachedCriteria());
	}
	
	public Categorias2DetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, database.Categorias2Criteria.class);
		id_categoria = new IntegerExpression("id_categoria", this.getDetachedCriteria());
		nombre = new StringExpression("nombre", this.getDetachedCriteria());
		edad = new IntegerExpression("edad", this.getDetachedCriteria());
		icono = new StringExpression("icono", this.getDetachedCriteria());
		videos = new CollectionExpression("ORM_videos", this.getDetachedCriteria());
	}
	
	public VideosDetachedCriteria createVideosCriteria() {
		return new VideosDetachedCriteria(createCriteria("ORM_videos"));
	}
	
	public Categorias2 uniqueCategorias2(PersistentSession session) {
		return (Categorias2) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Categorias2[] listCategorias2(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Categorias2[]) list.toArray(new Categorias2[list.size()]);
	}
}

