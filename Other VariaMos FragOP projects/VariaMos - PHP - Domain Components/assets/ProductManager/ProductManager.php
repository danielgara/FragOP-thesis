<?php if(! defined('BASEPATH')) exit('No direct script access allowed');

class ProductManager extends CI_controller {

	public function __construct()
    {
        parent::__construct();
        /*B-constructor-point*/
    }

	public function index()
	{
		/*B-product-data-collection*/
		$data['title'] = "Product Manager";
		$data['products'] = $products;

		$this->load->vars($data);
		$this->load->view('header');
		$this->load->view('product_manager');
		$this->load->view('footer');
	}

	public function add()
	{
		/* here code to add a product*/
	}

	public function edit()
	{
		/* here code to edit a product*/
	}

	public function remove()
	{
		/* here code to remove a product*/
	}
}
