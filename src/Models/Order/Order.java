package Models.Order;

import java.util.Date;
import java.util.List;

public class Order {
	public Date date;
	public List<ChocolateOrder> chocolates;
	public int total;

	public Order() {
	}
	public List<ChocolateOrder> getChocolates() {
		return chocolates;
	}
	public void setChocolates(List<ChocolateOrder> chocolates) {
		this.chocolates = chocolates;
	}
	public Order (Date date) {
		this.date = date;
	}
	public void addChocolate(ChocolateOrder ch) {
		chocolates.add(ch);
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "Order [date=" + date + ", chocolates=" + chocolates
				+ ", total=" + total + "]";
	}
}
