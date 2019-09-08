<div class="main">
<div class="container">
        <h1>Login</h1>
</div>
</div>

<div class="container">
<?php echo form_open('Login/connect'); ?>

<div class="form-group">
    <label for="code">Enter the code:</label>
    <input type="text" name="code" class="form-control" id="code">
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>


<?php echo form_close();?>
</div>