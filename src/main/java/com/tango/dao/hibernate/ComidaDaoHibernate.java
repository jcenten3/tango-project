package com.tango.dao.hibernate;

import java.util.List;

import org.appfuse.dao.hibernate.GenericDaoHibernate;
import com.tango.dao.ComidaDao;
import com.tango.model.Comida;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("comidaDao")
public class ComidaDaoHibernate extends GenericDaoHibernate<Comida, Long>implements ComidaDao {

	public ComidaDaoHibernate() {
		super(Comida.class);
	}

	public List<Comida> findByTipo(String tipo) {
		return getSession().createCriteria(Comida.class).add(Restrictions.eq("tipo", tipo)).list();	
		}
	

	public List<Comida> findByNombre(String nombre) {
		return getSession().createCriteria(Comida.class).add(Restrictions.eq("nombre", nombre)).list();	
		}
	
	public List<Comida> findByDias(String diasDisponibles) {
		return getSession().createCriteria(Comida.class).add(Restrictions.eq("diasDisponibles", diasDisponibles)).list();	
		}

}