$(document).ready(function() {
	sendMailToFriend();
});
function sendMailToFriend() {
	if ($("#sendEmail")) {
		$("#sendEmail").validate({
			rules : {
				email : {
					required : true,
					email : true
				}
			},
			messages : {
				email : {
					required : "Ce champ est obligatoire",
					email : "Merci de saisir une adresse e-mail valide"
				}
			},
			submitHandler : function(form) {
				// setup some local variables
				var $form = $(form);

				// Let's select and cache all the fields
				var $inputs = $form.find("input, select, button, textarea");

				// Serialize the data in the form
				var serializedData = $form.serialize();

				// Disabled tous les inputs.
				$inputs.prop("disabled", true);

				// call Action
				var request = $.ajax({
					url : $form.attr("action"),
					type : "post",
					data : serializedData
				});

				request.always(function(jqXHR, textStatus, errorThrown) {
					// Disabled tous les inputs.
					$inputs.removeAttr("disabled");
					$('#modalSendMail').modal('hide');
				});
			}
		});
	}
}

function changeOfferUrl(url) {
	$("#sendEmail").find("[name='offerurl']").val(url);
}