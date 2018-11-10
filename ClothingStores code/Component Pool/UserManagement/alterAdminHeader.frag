Fragment UserManagement-AlterAdminHeader { 
   Action: add
   Priority: high
   FragmentationPoints: menu-admin-modificator
   PointBracketsLan: html
   Destinations: BasicViewsAdmin-Header
   SourceCode: [ALTERCODE-FRAG]<li>
            <a class="nav-link" href="<c:url value='Users'/>">Manage Users</a>
           </li>[/ALTERCODE-FRAG]
}