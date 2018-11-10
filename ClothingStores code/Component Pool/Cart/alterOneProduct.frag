Fragment Cart-AlterOneProduct { 
   Action: add
   Priority: medium
   FragmentationPoints: alter-pdata2
   PointBracketsLan: html
   Destinations: ListOfProducts-OneProduct
   SourceCode: [ALTERCODE-FRAG]<br />
	        <b>Add product to cart:</b><br />
	        <form action="./Cart" method="POST">
	        <input type="hidden" name="id" value="${id}" />
	        Quantity:<br /> <input type="text" size="1" name="qty" value="1" /> <input type="submit" value="Add to Cart" />
			</form>[/ALTERCODE-FRAG]
}