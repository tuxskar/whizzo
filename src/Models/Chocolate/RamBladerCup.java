package Chocolate;

public class RamBladerCup implements Chocolate {
	public RAMTYPE ramType;
	public CHOCOLATETYPE type;
	public static double VALUE = 0.15;

	public RamBladerCup(RAMTYPE rtype) {
		type = CHOCOLATETYPE.RamBladerCup;
        ramType = rtype;
	}

	public CHOCOLATETYPE getType () {
		return type;
	}
	
	public double getValue(){
		return (double) (VALUE + (ramType.equals(RAMTYPE.BUTTERFLY) ? 0.07 : 0));
	}
	
	public RAMTYPE getRamType(){
		return ramType;
	}

	@Override
	public CHOCOLATETYPE chocolateType() {
		// TODO Auto-generated method stub
		return null;
	}
}
