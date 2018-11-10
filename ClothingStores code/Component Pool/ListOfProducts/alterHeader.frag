Fragment ListOfProducts-AlterHeader { 
   Action: add
   Priority: high
   FragmentationPoints: menu-modificator
   PointBracketsLan: html
   Destinations: BasicViewsGeneral-Header
   SourceCode: [ALTERCODE-FRAG]<li>
            <a class="nav-link" href="<c:url value='Products'/>">Products</a>
           </li>[/ALTERCODE-FRAG]
}