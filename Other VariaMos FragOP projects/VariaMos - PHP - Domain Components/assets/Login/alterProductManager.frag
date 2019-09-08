Fragment Login-AlterProductManager { 
   Action: add 
   FragmentationPoint: constructor-point
   PointBracketsLan: php
   Destination: ProductManager-ProductManager
   SourceCode: [ALTERCODE-FRAG]if($this->session->userdata('admin')==0){
        	redirect('/Home/', 'refresh');
        }[/ALTERCODE-FRAG]
}