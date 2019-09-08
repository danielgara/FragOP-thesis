<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title><?php echo($title); ?></title>
  <link href="<?php echo base_url(); ?>assets/css/style.css" rel="stylesheet">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
 
<nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container">
        <div id="navbar">
          <ul class="nav navbar-nav">
            <li><a href="<?php echo base_url(); ?>index.php/Home/">Home</a></li>
            <!--B-menu-options-modificator-->

<!--Code injected by: ListProducts-AlterHeader-->
<li><a href="<?php echo base_url(); ?>index.php/Products/">Products</a></li>
<!--Code injected by: ListProducts-AlterHeader-->


<!--Code injected by: Login-AlterHeader-->
<?php if ($this->session->userdata('admin')==0){ ?>
            <li><a href="<?php echo base_url(); ?>index.php/Login/">Login</a></li>
            <?php }else{ ?>
            <li><a href="<?php echo base_url(); ?>index.php/Login/disconnect">Logout</a></li>
            <?php } ?>
<!--Code injected by: Login-AlterHeader-->

          </ul>
        </div>
      </div>
    </nav>