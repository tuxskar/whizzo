package Chocolate;

public class RamBladerCup implements Chocolate {
	public RAMTYPE type;

	public RamBladerCup(RAMTYPE type) {
		this.type = type;
	}

	public RAMTYPE getType () {
		return this.type;
	}
	
	public int getValue(int value){
		return value;
	}
	
	public CHOCOLATETYPE chocolateType(){
		return CHOCOLATETYPE.RamBladerCup;
	}
}