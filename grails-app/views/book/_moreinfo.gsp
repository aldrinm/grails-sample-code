<g:remoteLink
    action="moreInfo" id="${id}"
    onSuccess="updateDetails(data, '${id}')" >${title}
</g:remoteLink>


<g:if test="${summary}">
  <br>
  ${summary}
</g:if>