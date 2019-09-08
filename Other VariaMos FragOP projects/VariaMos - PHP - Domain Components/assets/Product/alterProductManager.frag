Fragment Product-AlterProductManager { 
   Action: add 
   FragmentationPoint: product-data-collection
   PointBracketsLan: php
   Destination: ProductManager-ProductManager
   SourceCode: [ALTERCODE-FRAG]$this->load->model('Product');
		$products = $this->Product->getAll();[/ALTERCODE-FRAG]
}