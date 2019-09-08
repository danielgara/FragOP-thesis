Fragment Product-AlterProducts { 
   Action: add 
   FragmentationPoint: product-data-collection
   PointBracketsLan: php
   Destination: ListOfProducts-Products
   SourceCode: [ALTERCODE-FRAG]$this->load->model('Product');
		$products = $this->Product->getAll();[/ALTERCODE-FRAG]
}