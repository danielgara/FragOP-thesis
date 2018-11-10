<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<html>
  <head>
    <title>${title}</title>
    <link rel="stylesheet" type="text/css" href="<c:url value = "/assets/css/bootstrap.min.css"/>" />
    <link rel="stylesheet" type="text/css" href="<c:url value = "/assets/css/style.css"/>" />
  </head>

  <body>
      
    <nav class="navbar navbar-expand-md navbar-dark fixed-top bg-dark">

      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>

      <div class="collapse navbar-collapse" id="navbarsExampleDefault">
        <ul class="navbar-nav mr-auto">
          <li class="nav-item active">
            <a class="nav-link" href="<c:url value='Home'/>">Home <span class="sr-only">(current)</span></a>
          </li>
          <!--B-menu-modificator-->

<!--Code injected by: ListOfProducts-AlterHeader-->
<li>
            <a class="nav-link" href="<c:url value='Products'/>">Products</a>
           </li>
<!--Code injected by: ListOfProducts-AlterHeader-->


<!--Code injected by: Login-AlterHeader-->
<c:choose>
    			 <c:when test="${sessionScope.logged != '1'}">
    			    <li>
	            <a class="nav-link" href="<c:url value='Login'/>">Login</a>
	            </li>
				   </c:when>    
    			 <c:otherwise>
		          <!--B-menu-modificator-login-->

<!--Code injected by: Account-AlterHeader-->
<li>
		            <a class="nav-link" href="<c:url value='Account'/>">Account</a>
		           </li>
<!--Code injected by: Account-AlterHeader-->

    			    <li>
	            <a class="nav-link" href="<c:url value='Login?logout=1'/>">Logout</a>
	            </li>
           </c:otherwise>
			     </c:choose>
<!--Code injected by: Login-AlterHeader-->


<!--Code injected by: Cart-AlterHeader-->
<li>
            <a class="nav-link" href="<c:url value='Cart'/>">Cart</a>
           </li>
<!--Code injected by: Cart-AlterHeader-->


<!--Code injected by: ContactUs-AlterHeader-->
<li>
            <a class="nav-link" href="<c:url value='Contact'/>">Contact Us</a>
           </li>
<!--Code injected by: ContactUs-AlterHeader-->


        </ul>
      </div>
    </nav>
    
   <div>