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
	        </div>
	    </div>
	   </div>

<%@ include file="footer.jsp" %>