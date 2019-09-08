<?php if(! defined('BASEPATH')) exit('No direct script access allowed');

class Home extends CI_controller {

	public function index()
	{
		$data['title'] = "SportEStores";

		$this->load->vars($data);
		$this->load->view('header');
		$this->load->view('index');
		$this->load->view('footer');
	}
}
