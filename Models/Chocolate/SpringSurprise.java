package Chocolate;

import java.awt.*;

public abstract class SpringSurprise implements Chocolate {
	public boolean wrapped;
	public Color color;

	public SpringSurprise(boolean wrapped, Color color) {
		this.color = color;
		this.wrapped = wrapped;
	}

	public Color getColor(SpringSurprise item) {
		return this.color;
	}

	public boolean isWrapper () {
		return this.wrapped;
	}
	
	public int getValue(int value){
		return value;
	}
	
	public CHOCOLATETYPE chocolateType(){
		return CHOCOLATETYPE.SpringSurprise;
	}
}