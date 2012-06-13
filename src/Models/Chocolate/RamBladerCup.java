package Models.Chocolate;

public class RamBladerCup implements Chocolate {
	public RAMTYPE ramType;
	public CHOCOLATETYPE type;
	public static double VALUE = 0.15;

	public RamBladerCup(RAMTYPE rtype) {
		type = CHOCOLATETYPE.RamBladerCup;
        ramType = rtype;
	}

	public static double getVALUE() {
		return VALUE;
	}

	public void setRamType(RAMTYPE ramType) {
		this.ramType = ramType;
	}

	public void setType(CHOCOLATETYPE type) {
		this.type = type;
	}

	public static void setVALUE(double vALUE) {
		VALUE = vALUE;
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

	@Override
	public String toString() {
		return "RamBladerCup [ramType=" + ramType + ", type=" + type + "]";
	}
	
}
