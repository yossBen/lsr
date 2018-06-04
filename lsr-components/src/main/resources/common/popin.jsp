<!-- POPIN -->
<div class="modal fade" id="modalSendMail" tabindex="-1" role="dialog" aria-labelledby="modalSendMailLabel">
	<div class="modal-dialog" role="document">
		<form id="sendEmail" action="<c:url value='${url.base}${currentNode.path}'/>.sendOfferToFriendAction.do">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="modalSendMailLabel">Envoyer par mail</h4>
				</div>
				<div class="modal-body">
					<input type="text" style="width: 100%; height: 30px;" placeholder="Entrez votre email" name="email">
					<input type="hidden" value="${pageContext.request.requestURL}?${pageContext.request.queryString}" name="offerurl">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Fermer</button>
					<button type="submit" class="btn btn-primary">Confirmer</button>
				</div>
			</div>
		</form>
	</div>
</div>