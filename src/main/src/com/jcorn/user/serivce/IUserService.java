package com.jcorn.user.serivce;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;


import com.jcorn.user.entity.User;

@Path(value = "/user")
@Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
public interface IUserService {

	@GET
	@Path("/")
	public List<User> getUser(@QueryParam(value = "user") User user) throws WebApplicationException;
	
	@GET
	@Path("/getUserByName/{name}")
	public User getUserByName(@PathParam(value = "name") String userName) throws WebApplicationException;

}
