package model;
import java.util.ArrayList;

import model.Products;

public class Cart {
   private ArrayList <Products> prods = new ArrayList<Products>();//all the products in the cart
   private int itemnumber;
   private ArrayList <Integer> qtynum = new ArrayList<Integer>();// store for quantity numbers
   
public Cart() {};
   
public void addprod(Products prod) {
		 this.prods.add(prod);
   }
public void addqty(int itemnumber) {
	this.qtynum.add(itemnumber);
}
public void deleteprod(int index) {
	this.prods.remove(index);
	this.qtynum.remove(index);
}
   
	   /**
	 * @return the prods
	 */
	public ArrayList<Products> getProds() {
		return prods;
	}
	
	/**
	 * @param prods the prods to set
	 */
	public void setProds(ArrayList<Products> prods) {
		this.prods = prods;
	}

	/**
	 * @return the itemnumber
	 */
	public int getItemnumber() {
		return itemnumber;
	}

	/**
	 * @param itemnumber the itemnumber to set
	 */
	public void setItemnumber(int itemnumber) {
		this.itemnumber = itemnumber;
	}

	/**
	 * @return the qtynum
	 */
	public ArrayList<Integer> getQtynum() {
		return qtynum;
	}

	/**
	 * @param qtynum the qtynum to set
	 */
	public void setQtynum(ArrayList<Integer> qtynum) {
		this.qtynum = qtynum;
	}
 
}//Cart
