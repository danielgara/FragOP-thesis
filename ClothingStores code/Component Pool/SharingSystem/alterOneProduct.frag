Fragment SharingSystem-AlterOneProduct { 
   Action: add
   Priority: medium
   FragmentationPoints: alter-pdata2
   PointBracketsLan: html
   Destinations: ListOfProducts-OneProduct
   SourceCode: [ALTERCODE-FRAG]<c:set var="req" value="${pageContext.request}" />
			<c:set var="baseURL" value="${fn:replace(req.requestURL, req.requestURI, '')}" />
			<c:set var="params" value="${requestScope['javax.servlet.forward.query_string']}"/>
			<c:set var="requestPath" value="${requestScope['javax.servlet.forward.request_uri']}"/>
			<c:set var="pageUrl" value="${ baseURL }${ requestPath }${ not empty params?'?'+=params:'' }"/>
	        <br />
	        <b>Share this product:</b><br />
	        <a href="https://www.facebook.com/sharer/sharer.php?u=<c:url value='${pageUrl}' />">
	        <img src="<c:url value='assets/img/fb.png' />">
	        </a>
	        
	        <a href="https://twitter.com/home?status=<c:url value='${pageUrl}' />">
	        <img src="<c:url value='assets/img/twitter.png' />">
	        </a>
	        <br />[/ALTERCODE-FRAG]
}