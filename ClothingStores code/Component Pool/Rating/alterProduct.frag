Fragment Rating-AlterProduct { 
   Action: add
   Priority: high
   FragmentationPoints: attribute-zone
   PointBracketsLan: java
   Destinations: ProductModel-Product
   SourceCode: [ALTERCODE-FRAG]private int num_rates;
	private int total_rates;[/ALTERCODE-FRAG]
}

Fragment Rating-AlterProduct2 { 
   Action: add
   Priority: high
   FragmentationPoints: constructor-attribute-zone, constructor-attribute-zone2
   PointBracketsLan: java
   Destinations: ProductModel-Product, ProductModel-Product
   SourceCode: [ALTERCODE-FRAG], int num_rates, int total_rates[/ALTERCODE-FRAG]
}

Fragment Rating-AlterProduct3 { 
   Action: add
   Priority: high
   FragmentationPoints: constructor-inside-zone, constructor-inside-zone2
   PointBracketsLan: java
   Destinations: ProductModel-Product, ProductModel-Product
   SourceCode: [ALTERCODE-FRAG]this.num_rates = num_rates;
		this.total_rates = total_rates;[/ALTERCODE-FRAG]
}

Fragment Rating-AlterProduct4 { 
   Action: add
   Priority: high
   FragmentationPoints: method-zone
   PointBracketsLan: java
   Destinations: ProductModel-Product
   SourceCode: [ALTERCODE-FRAG]public int getNum_rates() {
		return num_rates;
	}

	public void setNum_rates(int num_rates) {
		this.num_rates = num_rates;
	}

	public int getTotal_rates() {
		return total_rates;
	}

	public void setTotal_rates(int total_rates) {
		this.total_rates = total_rates;
	}
	
	public int getRate() {
		if(num_rates==0){return 0;}
		return total_rates/num_rates;
	}[/ALTERCODE-FRAG]
}