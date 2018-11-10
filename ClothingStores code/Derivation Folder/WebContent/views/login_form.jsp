<%@ include file="header.jsp" %>

      <div class="jumbotron">
        <div class="container">
          <h1 class="display-3">Login</h1>
          <p>Connect to the system</p>
        </div>
      </div>
      
      <div class="container">
      <form action="<c:url value='Login'/>" method="post">
		<div class="form-group">
		    <label for="us">Enter the user:</label>
		    <input type="text" name="user" class="form-control" id="us">
		    <label for="ps">Enter the password:</label>
		    <input type="password" name="pass" class="form-control" id="ps">
		  </div>
		
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

<%@ include file="footer.jsp" %>