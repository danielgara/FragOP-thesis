<%@ include file="header.jsp" %>

      <div class="jumbotron">
        <div class="container">
          <h1 class="display-3">Manage Comments</h1>
        </div>
      </div>
      
      <div class="container">
      <div class="row">
      
      <form action="<c:url value='Comments'/>" method="post">
		<div class="form-group">
		<h2>Create a new comment</h2>
		    <label>Enter the product:</label> <input required="required" type="text" class="form-control" name="product">
		    <label>Enter the description:</label> <textarea required="required" name="description" class="form-control"></textarea>
		  </div>
		
		  <button type="submit" class="btn btn-primary">Create</button>
		</form>
      </div>
        <div class="row">

			<table class="table table-bordered">
			<tr>
				<th width="120">Description</th>
				<th width="120">Product</th>
				<th width="120">Date</th>
				<th width="120">Remove</th>
			</tr>
			<c:forEach items="${comments}" var="comment">
			<tr>
			<td>${comment.getDescription()}</td>
			<td>${comment.getProduct()}</td>
			<td>${comment.getDate()}</td>
			<td><a href="./Comments?remove=${comment.getId()}">Remove</a></td>
			</tr>			
			</c:forEach>
			</table>
			
		</div>
		</div>
		
<%@ include file="../footer.jsp" %>