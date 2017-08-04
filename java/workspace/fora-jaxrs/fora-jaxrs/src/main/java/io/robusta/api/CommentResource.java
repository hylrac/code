package io.robusta.api;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import io.robusta.business.CommentBusiness;
import io.robusta.demo.providers.NotFoundException;
import io.robusta.domain.Comment;

@Path("comments")
@Produces("application/json")
public class CommentResource {
	

	
	@GET
	@Path("{idComment}")
	public Comment findCommentById(@PathParam("idComment") String idComment) {
		Comment	comment = new CommentBusiness().getCommentById(idComment);
		if (comment == null) {
			throw new NotFoundException("No comment " + idComment + " found.");
		}
		return comment;
		
		
	}
	
	@PUT
	@Path("{idComment}")
	public Response updateScore(@PathParam("idComment") String idComment, @QueryParam("vote") String vote) {
		Comment comment = new CommentBusiness().getCommentById(idComment);
		if (vote.equals("up")){
			comment.up();
		}else if (vote.equals("down")){
			comment.down();
		}
		
		return Response.status(200).entity(comment.getScore()).build();
		
	}

}
