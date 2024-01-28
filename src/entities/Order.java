package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private Date moment;
	private OrderStatus status;
	
	private Client client;
	
	private List<OrderItem> items = new ArrayList<>();
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");
	
	public Order() {
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public double total() {
		double soma = 0.0;
		for(OrderItem item : items) {
			soma += item.subTtotal();
		}
		return soma;
	}
	
	@Override
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    sb.append("Order Moment: ");
	    sb.append(sdf.format(moment) + "\n");
	    sb.append("Order Status: ");
	    sb.append(status + "\n");
	    sb.append("Client: ");
	    sb.append(client.getName() + " (" + sdf1.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n"); 
	    sb.append("Order Items: \n");
	    for (OrderItem item : items) {
	        sb.append(item + "\n");
	    }
	    sb.append("Total Price: ");
	    sb.append(String.format("%.2f", total()));

	    return sb.toString();
	}

}
