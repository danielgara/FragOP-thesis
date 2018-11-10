<%@ include file="header.jsp" %>

      <div class="jumbotron">
        <div class="container">
          <h1 class="display-3">Manage Users</h1>
        </div>
      </div>
      
      <div class="container">
      <div class="row">
      
      <form action="<c:url value='Users'/>" method="post">
		<div class="form-group">
		<h2>Create a new user</h2>
		    <label>Enter the name:</label> <input required="required" type="text" class="form-control" name="name">
		    <label>Enter the user:</label> <input required="required" type="text" class="form-control" name="user">
		    <label>Enter the type:</label> <select class="form-control" name="type"><option value="user">User</option><option value="admin">Admin</option></select>
		    <label>Enter the password:</label> <input required="required" class="form-control" type="password" name="pass">
		  </div>
		
		  <button type="submit" class="btn btn-primary">Create</button>
		</form>
      </div>
        <div class="row">

			<table class="table table-bordered">
			<tr>
				<th width="120">Name</th>
				<th width="120">Type</th>
				<th width="120">User</th>
				<th width="120">Remove</th>
			</tr>
			<c:forEach items="${users}" var="user">
			<tr>
			<td>${user.getName()}</td>
			<td>${user.getType()}</td>
			<td>${user.getUser()}</td>
			<td><a href="./Users?remove=${user.getId()}">Remove</a></td>
			</tr>			
			</c:forEach>
			</table>
			
		</div>
		</div>
		
<%@ include file="../footer.jsp" %>