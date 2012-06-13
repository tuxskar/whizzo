package Models.Machine;

import Models.Chocolate.CHOCOLATETYPE;

public class Product {

	CHOCOLATETYPE chocType = null;
	int productTime = 0;

	public Product(CHOCOLATETYPE choc, int productTime){
		this.chocType = choc;
		this.productTime = productTime;		
	}

	public CHOCOLATETYPE getChocType() {
		return chocType;
	}

	public int getProductTime() {
		return productTime;
	}

	public void setChocType(CHOCOLATETYPE chocType) {
		this.chocType = chocType;
	}

	public void setProductTime(int productTime) {
		this.productTime = productTime;
	}

	@Override
	public String toString() {
		return "Product [chocType=" + chocType + ", productTime=" + productTime
				+ "]";
	}
	
}
