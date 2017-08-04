package io.robusta.api;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.robusta.business.CommentBusiness;
import io.robusta.business.TopicBusiness;
import io.robusta.business.UserBusiness;
import io.robusta.domain.Comment;
import io.robusta.domain.Topic;
import io.robusta.domain.User;

@Path("topics")
@Produces("application/json")
public class TopicResource {

/*	@GET
	@Produces("text/html")
	public String findTopics() throws Exception {

		// return ForaDataSource.getInstance().getTopics();
		String list = new TopicBusiness()
				.getAllTopics()
				.stream()
				.map(topic -> topic.getTitle())
				.map(title -> "<li>" + title + "</li>")
				.collect(Collectors.joining());
		return "<html><body><ul>" + list + "</ul></body></html>";
	}*/

	@GET
	public List<Topic> findTopicByIdByQuery() throws Exception {
		return new TopicBusiness().getAllTopics() ;

	}
	
	@POST
	@Produces("application/json")
	public Topic addTopic (Topic topic) throws Exception {
		Topic t = new TopicBusiness().createTopic(topic);
		return t;
	}
	/*
	 * @GET
	 * 
	 * @Path("{id}") public Topic findTopicByIdByPath(@PathParam("id") Long id)
	 * throws Exception { Topic topic = new TopicBusiness().getTopicById(id); if
	 * (topic==null) { throw new NotFoundException("No topic "+id+" found."); }
	 * return topic;
	 * 
	 * }
	 */

	@POST
	@Path("{idTopic}/comments")
	public Response createComment(@PathParam("idTopic") long idTopic, Comment representation) {
		Topic topic = new TopicBusiness().getTopicById(idTopic);
		boolean anonymous = false;
		User user=null;
		if (representation.getUser() == null) {
			anonymous = true;
		} else {
			user = new UserBusiness().findById(representation.getUser().getId());
			if (user == null) {
				return Response
						.status(401)
						.entity("Please log in")
						.build();
			}
		}
		Comment comment = new CommentBusiness().createComment(topic, representation.getContent(), user, anonymous);
		return Response
				.status(201)
				.entity(comment)
				.build();
	}
}
