<?php if(! defined('BASEPATH')) exit('No direct script access allowed');

class Login extends CI_controller {

	public function index()
	{
		$data['title'] = "Login";

		$this->load->vars($data);
		$this->load->view('header');
		$this->load->view('login_form');
		$this->load->view('footer');
	}

	public function connect()
	{
		$data['title'] = "Login";

		if($this->input->post('code')==345){
			$data['admin']=1;
			$this->session->set_userdata($data);
			redirect('/Home/', 'refresh');
		}else{
			$data['title'] = "Login";

			$this->load->vars($data);
			$this->load->view('header');
			$this->load->view('login_form');
			$this->load->view('footer');
		}
	}

	public function disconnect()
	{
		$this->session->unset_userdata('admin');
		redirect('/Home/', 'refresh');
	}

}

?>