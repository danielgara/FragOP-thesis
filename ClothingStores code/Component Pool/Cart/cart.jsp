<%@ include file="header.jsp" %>

      <div class="jumbotron">
        <div class="container">
          <h1 class="display-3">Cart</h1>
        </div>
      </div>

      <div class="container">
      
        <div class="row">
          <div class="col-md-12">
          <c:set var="total" value="0" />
          	<c:if test="${not empty products}">
 			<table class="tg">
				<tr>
				<th width="120">Name</th>
				<th width="120">Price</th>
				<th width="120">QTY</th>
				<th width="120">Subtotal</th>
				<th width="120">Remove</th>
				</tr>
				<c:forEach items="${products}" var="pro">
				<tr><td>${pro.getName()}</td>
				<td>${pro.getPrice()}</td>
				<c:set var="pid" value="${pro.getId()}" />
				<c:set var="subtotal" value="${pro.getPrice() * qty[pid]}" />
				<c:set var="total" value="${pro.getPrice() * qty[pid] + total}" />
				<td><c:out value="${qty[pid]}" /></td>
				<td><c:out value="${subtotal}" /></td>
				<td><a href="./Cart?remove=${pro.getId()}">Remove this product</a></td>
				</c:forEach>
				</table><br /><br />
				<b>Total:</b> <c:out value="${total}" /><br /><br />
				
				<a href="./Cart?clear=1">Clear Cart</a>

				<!--B-payment-zone-->
			</c:if>          
          </div>
        </div>
        
       </div>


<%@ include file="footer.jsp" %>