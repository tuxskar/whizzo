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

}
