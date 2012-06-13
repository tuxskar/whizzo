package Models.Chocolate;

public class CrunchyFrog implements Chocolate {

	public CHOCOLATETYPE type = null;
	public static double VALUE = 0.15;
	
	public CrunchyFrog() {
		type = CHOCOLATETYPE.CrunchyFrog;
	}
	
	public double getValue(){
		return VALUE;
	}
	
	public CHOCOLATETYPE chocolateType(){
		return type;
	}



	public void setType(CHOCOLATETYPE type) {
		this.type = type;
	}

	public static void setVALUE(double vALUE) {
		VALUE = vALUE;
	}

	@Override
	public String toString() {
		return "CrunchyFrog [type=" + type + "]";
	}
}
