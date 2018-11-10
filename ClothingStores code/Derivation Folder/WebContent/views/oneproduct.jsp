<%@ include file="header.jsp" %>

      <div class="jumbotron">
        <div class="container">
          <h1 class="display-3">${pro.getName()}</h1>
        </div>
      </div>
      
      <div class="container">
        <div class="row">
        
	        <div class="col-md-3">
			<div class="box_slide">
				<div class="box_image">
				<img src="${pro.getImg()}" class="gall-img-responsive">
				</div>
			</div>
			</div>	
			<div class="col-md-6">
			
	        <b>${pro.getName()}</b><br />
	        <b>Price:</b> ${pro.getPrice()}<br />
	        <!--B-alter-pdata-->

			<br />${pro.getDescription()}<br />
			<!--B-alter-pdata2-->

<!--Code injected by: Cart-AlterOneProduct-->
<br />
	        <b>Add product to cart:</b><br />
	        <form action="./Cart" method="POST">
	        <input type="hidden" name="id" value="${id}" />
	        Quantity:<br /> <input type="text" size="1" name="qty" value="1" /> <input type="submit" value="Add to Cart" />
			</form>
<!--Code injected by: Cart-AlterOneProduct-->


<!--Code injected by: SharingSystem-AlterOneProduct-->
<c:set var="req" value="${pageContext.request}" />
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
	        <br />
<!--Code injected by: SharingSystem-AlterOneProduct-->

	        </div>
	    </div>
	   </div>

<%@ include file="footer.jsp" %>