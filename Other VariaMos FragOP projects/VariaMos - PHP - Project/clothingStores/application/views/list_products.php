<div class="main">
<div class="container">
        <h1>List of Products</h1>
</div>
</div>

<div class="container">

<?php foreach ($products as $product){ ?>
<div class="col-md-3">
<div class="box_slide">

	<div class="box_image">
	<img src="<?php echo $product->getImage();?>" class="gall-img-responsive">
	</div>

	<div class="caption">
	<?php echo $product->getTitle();?>
	<p>$<?php echo $product->getPrice();?></p>
	</div>
										
</div>
</div>
<?php } ?>

</div>