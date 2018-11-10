Fragment Login-AlterHeader { 
   Action: add
   Priority: high
   FragmentationPoints: menu-modificator
   PointBracketsLan: html
   Destinations: BasicViewsGeneral-Header
   SourceCode: [ALTERCODE-FRAG]<c:choose>
    			 <c:when test="${sessionScope.logged != '1'}">
    			    <li>
	            <a class="nav-link" href="<c:url value='Login'/>">Login</a>
	            </li>
				   </c:when>    
    			 <c:otherwise>
		          <!--B-menu-modificator-login-->
    			    <li>
	            <a class="nav-link" href="<c:url value='Login?logout=1'/>">Logout</a>
	            </li>
           </c:otherwise>
			     </c:choose>[/ALTERCODE-FRAG]
}