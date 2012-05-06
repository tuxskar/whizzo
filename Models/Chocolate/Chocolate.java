package Chocolate;

enum CHOCOLATETYPE {CrunchyFrog, SpringSurprise, RamBladerCup, NULL};

public interface Chocolate {

	public CHOCOLATETYPE type = CHOCOLATETYPE.NULL;
	public int value = 0;

	public CHOCOLATETYPE chocolateType(CHOCOLATETYPE type);

	public int getValue(int value);
	
	
}