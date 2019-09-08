Fragment Login-AlterHeader { 
   Action: add 
   FragmentationPoint: menu-options-modificator
   PointBracketsLan: html
   Destination: BasicViewsHtml-Header
   SourceCode: [ALTERCODE-FRAG]<?php if ($this->session->userdata('admin')==0){ ?>
            <li><a href="<?php echo base_url(); ?>index.php/Login/">Login</a></li>
            <?php }else{ ?>
            <li><a href="<?php echo base_url(); ?>index.php/Login/disconnect">Logout</a></li>
            <?php } ?>[/ALTERCODE-FRAG]
}