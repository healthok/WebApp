package model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class OrderedItems {
	
	@Id @GeneratedValue
	private int orderedItemsId;
	private float price;
	private int quantity;
	public int getOrderedItemsId() {
		return orderedItemsId;
	}
	public void setOrderedItemsId(int orderedItemsId) {
		this.orderedItemsId = orderedItemsId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
