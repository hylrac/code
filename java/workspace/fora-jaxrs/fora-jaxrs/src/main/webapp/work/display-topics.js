$.get('http://localhost:8080/jax-rs-1/fora/topics')
    .then(topics => topics.forEach(function (topic) {
    	const li = $('<li>').attr('topic-id',topic.id).text(topic.title);
        $('section.topics ul').append(li);
        li.on('click', ()=>selectTopic(topic));
    }));

function selectTopic(topic){
	$('section.selected ul').empty();
	topic.comments.forEach(function (comment) {
		
		const name = comment.user ? comment.user.name : "anonymous";
        const li = $('<li>').text(`${name} says: ${comment.content}`);
        $('section.selected ul').append(li);
        
    });
	customForm(topic);
	
}



function customForm(topic){
	
	
	const url = `/jax-rs-1/fora/topics/${topic.id}/comments`;
	
	$('button').on('click', function(){
		const content = $('input').val();
		const  user = {
				 id:2,
				 name:"Nicolas"
				
			 }
		const comment = {user,content};
		$.ajax({
			type: "POST",
			url: url,
			contentType:'application/json',
			dataType: 'json',
			data: JSON.stringify(comment)
		}).then(function () {
		
		const name = comment.user ? comment.user.name : "anonymous";
        const li = $('<li>').text(`${name} says: ${comment.content}`);
        $('section.selected ul').append(li);
        
		})
		
	})
	
	 
}

function addCommentInTopic(content,user,topic) {

}