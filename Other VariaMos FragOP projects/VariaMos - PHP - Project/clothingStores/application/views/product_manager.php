<div class="main">
<div class="container">
        <h1>Product Manager</h1>
</div>
</div>

<div class="container">
<table class="table table-bordered">
<tr>
		<th>ID</th>
		<th>Title</th>
		<th>Edit</th>
		<th>Remove</th>
	</tr>
<?php foreach ($products as $product){ ?>
	<tr>
		<td><?php echo $product->getId();?></td>
		<td><?php echo $product->getTitle();?></td>
		<td><span class="glyphicon glyphicon-pencil"></span></td>
		<td><span class="glyphicon glyphicon-remove"></span></td>
	</tr>
<?php } ?>
</table>
</div>

<div class="container">
<p><a class="btn btn-primary btn-lg" href="#" role="button">Add a product</a></p>
</div>