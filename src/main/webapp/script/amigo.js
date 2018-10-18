function loadAmigosFuncis() {
	$('.bborrar').click(function() {
		let parent = this.parentNode;
		let id = this.getAttribute('data-id');
		console.log('Hola', id);
		$.ajax({
			url : `./reserva?id=${id}`,
			type : "POST",
			accepts : "application/json"
		}).done(function(data) {
			console.log(data);
			if (data.result) {
				parent.remove();
			}

		}).fail(function(error) {
			console.log("error", error);
		});
	});

}
