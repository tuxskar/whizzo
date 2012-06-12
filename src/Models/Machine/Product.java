package Models.Machine;

import Models.Chocolate.CHOCOLATETYPE;

public class Product {

	CHOCOLATETYPE chocType = null;
	int productTime = 0;

	public Product(CHOCOLATETYPE choc, int productTime){
		this.chocType = choc;
		this.productTime = productTime;		
	}
}
