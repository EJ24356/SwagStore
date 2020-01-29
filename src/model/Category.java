package model;

public class Category {
    private int categoryID;
    private String categoryname;
    private String description;
    
    
	/**
	 * @param categoryID
	 * @param categoryname
	 * @param description
	 */
	public Category(int categoryID, String categoryname, String description) {
		this.categoryID = categoryID;
		this.categoryname = categoryname;
		this.description = description;
	}
	

	/**
	 * 
	 */
	public Category() {
		this.categoryID = 1;
		this.categoryname = "Clothes";
		this.description = "Men/Women's Attire";
	}
	
	/**
	 * sets the default name and description for categoryID 2 & 3
	 */
	public void namedescrip() {
		if (this.categoryID == 2) {
			this.categoryname = "Snacks";
			this.description = "Chips, Candy, etc";
		}//
		else if	(this.categoryID == 3) {
			this.categoryname = "Swag";
			this.description = "Accessories";
		}
	}


	/**
	 * @return the categoryID
	 */
	public int getCategoryID() {
		return categoryID;
	}
	/**
	 * @param categoryID the categoryID to set
	 */
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	/**
	 * @return the categoryname
	 */
	public String getCategoryname() {
		return categoryname;
	}
	/**
	 * @param categoryname the categoryname to set
	 */
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Category [categoryID=" + categoryID + ", categoryname=" + categoryname + ", description=" + description
				+ "]";
	}
    
    
	
}
