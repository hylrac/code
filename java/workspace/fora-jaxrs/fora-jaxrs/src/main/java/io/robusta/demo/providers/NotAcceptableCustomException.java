package io.robusta.demo.providers;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

public class NotAcceptableCustomException extends WebApplicationException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotAcceptableCustomException (String message){
		super(Response.status(406).entity(message).build());
	}

}
