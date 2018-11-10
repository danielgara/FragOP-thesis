<%@ include file="header.jsp" %>

      <div class="jumbotron">
        <div class="container">
          <h1 class="display-3">List of Products</h1>
          <p>A wide variety of products</p>
        </div>
      </div>
      
      <div class="container">
        <div class="row">
		<c:forEach items="${products}" var="pro">
		<div class="col-md-3">
		<div class="box_slide">
		
			<div class="box_image">
			<img src="${pro.getImg()}" class="pimage" class="gall-img-responsive">
			</div>
		
			<div class="caption">
			<a href="<c:url value='Products?id=${pro.getId()}' />">${pro.getName()}</a>
			<p>${pro.getPrice()}</p>
			</div>
												
		</div>
		</div>
		</c:forEach>
		</div>
	</div>

<%@ include file="footer.jsp" %>