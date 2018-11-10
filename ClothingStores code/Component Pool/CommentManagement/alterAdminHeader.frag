Fragment CommentManagement-AlterAdminHeader { 
   Action: add
   Priority: high
   FragmentationPoints: menu-admin-modificator
   PointBracketsLan: html
   Destinations: BasicViewsAdmin-Header
   SourceCode: [ALTERCODE-FRAG]<li>
            <a class="nav-link" href="<c:url value='Comments'/>">Manage Comments</a>
           </li>[/ALTERCODE-FRAG]
}