package com.tango.dao;

import java.util.List;

import org.appfuse.dao.GenericDao;
import com.tango.model.Comida;

public interface ComidaDao extends GenericDao<Comida, Long>{
    public List<Comida> findByTipo(String tipo);
    //Va a buscar por tipo de comida
    
    public List<Comida> findByNombre(String nombre);
    //Va a buscar por el nombre de la comida
    
    public List<Comida> findByDias(String diasDisponibles);
    //Va a buscar por dias disponibles

}
