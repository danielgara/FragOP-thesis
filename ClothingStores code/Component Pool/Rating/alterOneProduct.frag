Fragment Rating-AlterOneProduct { 
   Action: add
   Priority: medium
   FragmentationPoints: alter-pdata2
   PointBracketsLan: html
   Destinations: ListOfProducts-OneProduct
   SourceCode: [ALTERCODE-FRAG]<br />
	        <b>Rate this product:</b><br />
	        <form action="./Products" method="POST">
	        <fieldset class="rating">
			    <input type="radio" id="star5" name="rating" value="5" /><label class = "full" for="star5" title="Awesome - 5 stars"></label>
			    <input type="radio" id="star4" name="rating" value="4" /><label class = "full" for="star4" title="Pretty good - 4 stars"></label>
			    <input type="radio" id="star3" name="rating" value="3" /><label class = "full" for="star3" title="Meh - 3 stars"></label>
			    <input type="radio" id="star2" name="rating" value="2" /><label class = "full" for="star2" title="Kinda bad - 2 stars"></label>
			    <input type="radio" id="star1" name="rating" value="1" /><label class = "full" for="star1" title="Sucks big time - 1 star"></label>
			</fieldset><br /><br />
			<input type="hidden" name="id" value="${id}" />
			<input type="submit" value="Rate" />
			</form>[/ALTERCODE-FRAG]
}

Fragment Rating-AlterOneProduct2 { 
   Action: add
   Priority: high
   FragmentationPoints: alter-pdata
   PointBracketsLan: html
   Destinations: ListOfProducts-OneProduct
   SourceCode: [ALTERCODE-FRAG]<b>Rate:</b> ${pro.getRate()}<br />[/ALTERCODE-FRAG]
}