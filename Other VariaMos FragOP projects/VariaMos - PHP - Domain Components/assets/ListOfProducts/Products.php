<?php if(! defined('BASEPATH')) exit('No direct script access allowed');

class Products extends CI_controller {

	public function index()
	{
		/*B-product-data-collection*/
		$data['title'] = "Products";
		$data['products'] = $products;
		$this->load->vars($data);
		$this->load->view('header');
		$this->load->view('list_products');
		$this->load->view('footer');
	}
}
