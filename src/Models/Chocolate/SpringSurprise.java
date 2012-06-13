package Models.Chocolate;

import java.awt.*;

public abstract class SpringSurprise implements Chocolate {
	public boolean wrapped;
	public Color color;

	public SpringSurprise(boolean wrapped, Color color) {
		this.color = color;
		this.wrapped = wrapped;
	}
	
	public boolean isWrapped() {
		return wrapped;
	}

	public Color getColor() {
		return color;
	}

	public void setWrapped(boolean wrapped) {
		this.wrapped = wrapped;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public int getValue(int value){
		return value;
	}
	
	public CHOCOLATETYPE chocolateType(){
		return CHOCOLATETYPE.SpringSurprise;
	}

	@Override
	public String toString() {
		return "SpringSurprise [wrapped=" + wrapped + ", color=" + color + "]";
	}
}