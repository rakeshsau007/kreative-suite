package io.org.springbootstarter.buisness;

public class Orders {
	
	private OrderStatus orders;
	private int totalOrder;
	
	
	public int getTotalOrder() {
		return totalOrder;
	}
	public void setTotalOrder(int totalOrder) {
		this.totalOrder = totalOrder;
	}
	/**
	 * @return the orders
	 */
	public OrderStatus getOrders() {
		return orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(OrderStatus orders) {
		this.orders = orders;
	}
   
}
