<?php
class Product extends CI_Model {

	private $id = "";
	private $title = "";
	private $price = "";
	private $image = "";
	private $desc = "";

	function __construct($id="",$title="",$price="",$image="",$desc="")
	{
		parent::__construct();
		if(isset($id)){$this->id=$id;}
		if(isset($title)){$this->title=$title;}
		if(isset($price)){$this->price=$price;}
		if(isset($image)){$this->image=$image;}
		if(isset($desc)){$this->desc=$desc;}
	}
	
	public function getId(){
		return $this->id;
	}
	
	public function getTitle(){
		return $this->title;
	}
	
	public function getPrice(){
		return $this->price;
	}
	
	public function getImage(){
		return $this->image;
	}

	public function getDesc(){
		return $this->desc;
	}

	public function getAll()
	{
		$list=array(new Product(102,"Super Shoes M1","99","http://www.danielgara.com/frag_images/img1.jpg"),new Product(120,"Super Shoes k7","69","http://www.danielgara.com/frag_images/img2.jpg"),new Product(103,"Super Shoes M1","89","http://www.danielgara.com/frag_images/img3.jpg"),new Product(104,"Super Shoes MT","99","http://www.danielgara.com/frag_images/img4.jpg"),new Product(105,"Super Shoes M3","99","http://www.danielgara.com/frag_images/img5.jpg"),new Product(106,"Super Shoes K1","69","http://www.danielgara.com/frag_images/img6.jpg"),new Product(107,"Super Shoes M8","79","http://www.danielgara.com/frag_images/img7.jpg"),new Product(108,"Super Shoes J1","99","http://www.danielgara.com/frag_images/img8.jpg"));
		return $list;

	}
}
?>