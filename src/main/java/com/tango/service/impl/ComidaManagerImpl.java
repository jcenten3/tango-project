package com.tango.service.impl;

import javax.jws.WebService;

import org.appfuse.service.impl.GenericManagerImpl;
import com.tango.dao.ComidaDao;
import com.tango.model.Comida;
import com.tango.service.ComidaManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("comidaManager")
@WebService(serviceName = "ComidaService", endpointInterface = "com.tango.service.ComidaManager")
public class ComidaManagerImpl extends GenericManagerImpl<Comida, Long>implements ComidaManager {

	ComidaDao comidaDao;

	public ComidaManagerImpl() {
	}

	@Autowired
	public ComidaManagerImpl(ComidaDao comidaDao) {
		super(comidaDao);
		this.comidaDao = comidaDao;
	}

	public List <Comida> getComidas() {
	    return comidaDao.getAll();
	}

}