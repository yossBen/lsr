$(document).ready(function() {
	sendMailToFriend();
	createAlertEmail();
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

function createAlertEmail() {
	$("#createAlerteForm").validate({
		rules : {
			email : {
				required : true,
				email : true
			},
			frequency : {
				required : true
			},
			expiration : {
				required : true
			}
		},
		messages : {
			email : {
				required : "Ce champ est obligatoire",
				email : "Merci de saisir une adresse e-mail valide"
			},
			frequency : {
				required : "Ce champ est obligatoire"
			},
			expiration : {
				required : "Ce champ est obligatoire"
			}
		},
		errorPlacement : function(error, element) {
			var parent = element.closest("div");
			if (parent.find('label.error').length == 0) {
				parent.append(error);
			}
			return true;
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
				data : serializedData + "&" + $form.data("query"),
			});

			request.always(function(jqXHR, textStatus, errorThrown) {
				// Disabled tous les inputs.
				$inputs.removeAttr("disabled");
				$('#modalAlerte').modal('hide');
			});
		}
	});
}

function changeOfferUrl(url) {
	$("#sendEmail").find("[name='offerurl']").val(url);
}