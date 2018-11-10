<%@ include file="header.jsp" %>

      <div class="jumbotron">
        <div class="container">
          <h1 class="display-3">Manage Products</h1>
        </div>
      </div>
      
      <div class="container">
      <div class="row">
      
      <form action="<c:url value='Products'/>" method="post">
		<div class="form-group">
		<h2>Create a new product</h2>
		    <label>Enter the name:</label> <input required="required" type="text" class="form-control" name="name">
		    <label>Enter the description:</label> <textarea required="required" name="description" class="form-control"></textarea>
		    <label>Enter the price:</label> <input required="required" type="text" class="form-control" name="price">
		    <label>Enter the Img (http://):</label> <input required="required" type="text" class="form-control" name="img">
		  </div>
		
		  <button type="submit" class="btn btn-primary">Create</button>
		</form>
      </div>
        <div class="row">

			<table class="table table-bordered">
			<tr>
				<th width="120">Name</th>
				<th width="120">Description</th>
				<th width="120">Price</th>
				<th width="120">Img</th>
				<th width="120">Remove</th>
			</tr>
			<c:forEach items="${products}" var="pro">
			<tr>
			<td>${pro.getName()}</td>
			<td>${pro.getDescription()}</td>
			<td>${pro.getPrice()}</td>
			<td>${pro.getImg()}</td>
			<td><a href="./Products?remove=${pro.getId()}">Remove</a></td>
			</tr>			
			</c:forEach>
			</table>
			
		</div>
		</div>
		
<%@ include file="../footer.jsp" %>