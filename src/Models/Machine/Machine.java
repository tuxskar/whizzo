package Machine;

import java.util.Date;

import Order.ChocolateOrder;

public interface Machine {

	public MACHINETYPE getType();

	public void addChocOrder(ChocolateOrder choc);

	public Date finishtAt();

}
