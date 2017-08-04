package io.robusta.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import io.robusta.ForaDataSource;
import io.robusta.business.UserBusiness;
import io.robusta.demo.providers.NotAcceptableCustomException;
import io.robusta.domain.User;

@Path("users")
@Produces("application/json")
@Consumes("application/json")
public class UserResource {
	
	@POST
	@Produces("application/json")
	public User addUser (String name) throws Exception {
		User u = new UserBusiness().createUser(name);
		return u;
	}

	@Path("test")
	@GET
	public String test() {
		return "test";
	}

	@GET

	public Response findUsers(@QueryParam("admin") String isAdmin) throws Exception {

		/**
		 * mettre isAdmin en Boolean List<User> listUsersAdmin = new
		 * ArrayList<>(); List<User> listUsersNonAdmin = new ArrayList<>(); for
		 * (User user : ForaDataSource.getInstance().getUsers()) { if
		 * (user.isAdmin()) { listUsersAdmin.add(user); } else {
		 * listUsersNonAdmin.add(user); } }
		 * 
		 * if (isAdmin==null) { return ForaDataSource.getInstance().getUsers();
		 * 
		 * 
		 * } else if (isAdmin) { return listUsersAdmin;
		 * 
		 * } else { return listUsersNonAdmin; }
		 */

		List<User> listUsers = new ArrayList<>();
		for (User user : ForaDataSource.getInstance().getUsers()) {

			if (isAdmin == null) {
				listUsers.add(user);
			} else {
				switch (isAdmin) {
				case "true":
					if (user.isAdmin())
						listUsers.add(user);
					break;
				case "false":
					if (!user.isAdmin())
						listUsers.add(user);
					break;

				default:
					// return Response.status(406).entity("Parameter admin must
					// be true or false").build();
					throw new NotAcceptableCustomException("Parameter admin must be true or false");

				}

			}

		}
		return Response.ok(listUsers).build();
	}
	/*
	 * @GET
	 * 
	 * @Produces("application/json") public User
	 * findUserByIdByQuery(@QueryParam("id") Long id) throws Exception { User
	 * user = new UserBusiness().findById(id); if (user==null) { throw new
	 * NotFoundException("No user "+id+" found."); } return user;
	 * 
	 * }
	 */

	@GET


	@Path("{id}")
	public User findUserByIdByPath(@PathParam("id") Long id) throws Exception {
		User user = new UserBusiness().findById(id);
		if (user == null) {
			throw new NotFoundException("No user " + id + " found.");
		}
		return user;

	}

	/*
	 * @GET public String helloAdmin(@QueryParam("admin") boolean isAdmin) {
	 * return "isAdmin ? " + isAdmin; }
	 */
}
