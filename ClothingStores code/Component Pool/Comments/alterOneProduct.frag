Fragment Comments-AlterOneProduct { 
   Action: add
   Priority: high
   FragmentationPoints: alter-pdata2
   PointBracketsLan: html
   Destinations: ListOfProducts-OneProduct
   SourceCode: [ALTERCODE-FRAG]</div>
			<div class="col-md-3">
	        <b>Comment product:</b><br />
	        <form action="./AddComment" method="POST">
	        Description:<br /> <textarea name="description"></textarea><br /><br />
			<input type="hidden" name="product" value="${id}" />
			<input type="submit" value="Comment" />
			</form>
			
			<table class="table table-bordered">
			<c:forEach items="${comments}" var="com">
			<tr>
			<td>${com.getDescription()}</td>
			<td>${com.getDate()}</td>
			</tr>			
			</c:forEach>
			</table>
			</div>[/ALTERCODE-FRAG]
}