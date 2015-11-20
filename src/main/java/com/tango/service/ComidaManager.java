package com.tango.service;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.appfuse.service.GenericManager;
import com.tango.model.Comida;

@WebService
@Path("/menu")
public interface ComidaManager extends GenericManager<Comida, Long> {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	List<Comida> getComidas();

}