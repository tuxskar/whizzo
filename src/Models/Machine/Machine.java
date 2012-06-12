package Models.Machine;

import java.util.Date;

import Models.Order.ChocolateOrder;

public interface Machine {

	public MACHINETYPE getType();

	public void addChocOrder(ChocolateOrder choc);

	public Date finishtAt();

}
