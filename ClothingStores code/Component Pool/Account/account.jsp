<%@ include file="header.jsp" %>

      <div class="jumbotron">
        <div class="container">
          <h1 class="display-3">Account</h1>
        </div>
      </div>

      <div class="container">
      
        <div class="row">
          <div class="col-md-6">
            <h2>User Data</h2><br /><br />
            <p><img src="<c:url value='assets/img/user.png' />" /></p>
          </div>
          <div class="col-md-6">
           <b>Name:</b> ${user.getName()}<br />
           <b>Type:</b> ${user.getType()}<br />
           <b>User:</b> ${user.getUser()}<br />
            
          </div>
        </div>
        
       </div>


<%@ include file="footer.jsp" %>
