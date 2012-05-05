class Customer {
	public String name;
	public String contact;
	public String address;
	public List<Order> orders;
	public Int ID;
	public Int total;

	public Customer() {
		
	}

	public void Customer (String name, String contact, String address, Int ID) {
		
	}

	public void addOrder (Order order) {
		
	}

	public void deleteOrder (DateTime date) {
		
	}

}

/*(NULL)*/
class Z implements Machine {
	public List<product> products = RamBladderCup:5;
	public Z type;

	public Z() {
		
	}

	public void machine (MACHINETYPE type) {
		
	}

	public MACHINETYPE getType () {
		
	}

	public void addChocOrder (ChocolateOrder choc) {
		
	}

}

/*(NULL)*/
class MACHINETYPE {
	public  X;
	public  Y;
	public  Z;

	public MACHINETYPE() {
		
	}

}

class CholoateOrder {
	public Int amount;
	public Chocolate choc;

	public CholoateOrder() {
		
	}

	public void ChocolotaOrder (Chocolate chocolate) {
		
	}

	public Int getAmount () {
		
	}

	public Chocolate getChoc () {
		
	}

}

/*(NULL)*/
class Chocolate {
	public CHOCOLATETYPE type;
	public Int value;

	public Chocolate() {
		
	}

	public CHOCOLATETYPE chocolateType () {
		
	}

	public Int getValue () {
		
	}

}

/*(NULL)*/
class Machine {
	public MACHINETYPE type;
	public List<Product> products;
	public Stack<ChocolateOrder> queue;

	public Machine() {
		
	}

	public void machine (MACHINETYPE type) {
		
	}

	public MACHINETYPE getType () {
		
	}

	public void addChocOrder (ChocolateOrder choc) {
		
	}

	/** Finalitation date */
	public static DateTime finishtAt () {
		
	}

}

/*(NULL)*/
class RamBladerCup implements Chocolate {
	public RAMTYPE type;

	public RamBladerCup() {
		
	}

	public RAMTYPE getType () {
		
	}

	/** 	 */
	public static void ramBladerCup (RAMTYPE type) {
		
	}

}

/*(NULL)*/
class CrunchyFrog implements Chocolate {

	public CrunchyFrog() {
		
	}

	public CHOCOLATETYPE chocolateType () {
		
	}

}

/*(NULL)*/
class RAMTYPE {
	public  SQUARE;
	public  OVAL;
	public  HEXAGONAL;
	public  BUTTERFLY;

	public RAMTYPE() {
		
	}

}

/*(NULL)*/
class SpringSurprise implements Chocolate {
	public Bool wrapped;
	public COLOR color;

	public SpringSurprise() {
		
	}

	public COLOR getColor () {
		
	}

	public Bool isWrapper () {
		
	}

}

/*(NULL)*/
class X implements Machine {
	public List<Product> products = CrunchyFrog:2,SpringSurprise:7;
	public X type;

	public X() {
		
	}

	public void machine (MACHINETYPE type) {
		
	}

	public MACHINETYPE getType () {
		
	}

	public void addChocOrder (ChocolateOrder choc) {
		
	}

}

/*(NULL)*/
class CHOCOLATETYPE {
	public  CrunchyFrog;
	public  SpringSurprise;
	public  RamBladerCup;

	public CHOCOLATETYPE() {
		
	}

}

class Order {
	public DateTime date;
	public List<ChocolateOrder> chocolates;
	public Int total;

	public Order() {
		
	}

	public void Order (DateTime date) {
		
	}

	public void addChocolate (ChocolateOrder ch) {
		
	}

}

/*(NULL)*/
class Y implements Machine {
	public List<Product> products = CrunchyFrog:4,RamBladderCup:18,SpringSurprise:10;
	public Y type;

	public Y() {
		
	}

	public void machine (MACHINETYPE type) {
		
	}

	public MACHINETYPE getType () {
		
	}

	public void addChocOrder (ChocolateOrder choc) {
		
	}

}

