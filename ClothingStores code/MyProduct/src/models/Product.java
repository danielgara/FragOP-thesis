package models;

public class Product {
	private int id;
	private String name;
	private String description;
	private int price;
	private String img;
	/*B-attribute-zone*/
	
	public Product(int id, String name, String description, int price, String img /*B-constructor-attribute-zone*/) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.img = img;
		/*B-constructor-inside-zone*/
	}
	
	public Product(String name, String description, int price, String img /*B-constructor-attribute-zone2*/) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
		this.img = img;
		/*B-constructor-inside-zone2*/
	}

	public Product(int id, String name, int price, String img) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.img = img;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getImg() {
		return img;
	}
	
	public void setImg(String img) {
		this.img = img;
	}

	/*B-method-zone*/

}
