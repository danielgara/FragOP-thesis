package models;

public class Comment {
	private int id;
	private int product;
	private String description;
	private String date;
	
	public Comment(int product, String description, String date) {
		super();
		this.product = product;
		this.description = description;
		this.date = date;
	}

	public Comment(int product, String description) {
		super();
		this.product = product;
		this.description = description;
	}

	public Comment(int id, int product, String description, String date) {
		super();
		this.id = id;
		this.product = product;
		this.description = description;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getProduct() {
		return product;
	}
	
	public void setProduct(int product) {
		this.product = product;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

}
