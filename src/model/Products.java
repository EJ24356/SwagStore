package model;

public class Products {
	
	private int productID;
	private String name;//product Name
	private String type;
	private double price;
	private int quaninstock;
	private int categoryID;
	
	
	/**
	 * @param productID
	 * @param name
	 * @param type
	 * @param price
	 * @param quaninstock
	 * @param 
	 * @param categoryID
	 */
	public Products(int productID, String name, String type, double price, int quaninstock,
			int categoryID) {
		this.productID = productID;
		this.name = name;
		this.type = type;
		this.price = price;
		this.quaninstock = quaninstock;
		this.categoryID = categoryID;
	}
	public Products() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}
	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the quaninstock
	 */
	public int getQuaninstock() {
		return quaninstock;
	}
	/**
	 * @param quaninstock the quaninstock to set
	 */
	public void setQuaninstock(int quaninstock) {
		this.quaninstock = quaninstock;
	}
	
	public int getCategoryID() {
		return categoryID;
	}
	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	@Override
	public String toString() {
		return "Products [productID=" + productID + ", name=" + name + ", type=" + type + ", price=" + price
				+ ", quaninstock=" + quaninstock + ", =" + ", categoryID=" + categoryID + "]";
	}
	
	
	
}
