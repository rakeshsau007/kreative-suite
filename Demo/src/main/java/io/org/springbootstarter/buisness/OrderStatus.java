package io.org.springbootstarter.buisness;

public class OrderStatus {
	
	
private int pending;
private int processed;
private int shipped;
private int canceled;



public int getPending() {
	return pending;
}
public void setPending(int pending) {
	this.pending = pending;
}
public int getProcessed() {
	return processed;
}
public void setProcessed(int processed) {
	this.processed = processed;
}
public int getShipped() {
	return shipped;
}
public void setShipped(int shipped) {
	this.shipped = shipped;
}
public int getCanceled() {
	return canceled;
}
public void setCanceled(int canceled) {
	this.canceled = canceled;
}

public OrderStatus(int pending, int processed, int shipped,int canceled){
	this.pending=pending;
	this.processed=processed;
	this.shipped=shipped;
	this.canceled=canceled;
}
public OrderStatus(){
	
}
}
