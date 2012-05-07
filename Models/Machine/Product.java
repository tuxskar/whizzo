package Machine;

enum CHOCOLATETYPE {CrunchyFrog, SpringSurprise, RamBladerCup, NULL};

public class Product {

	CHOCOLATETYPE chocType = CHOCOLATETYPE.NULL;
	int productTime = 0;
	
	public void product(CHOCOLATETYPE chocType, int productTime){
		this.chocType = chocType;
		this.productTime = productTime;		
	}
	
}
