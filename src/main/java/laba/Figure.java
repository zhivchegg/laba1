package laba;

import laba.*;

public abstract class Figure {
	private String color;
	private double lineWidth;
	void setLineWidth(double lineWidth) {
		this.lineWidth = lineWidth;
	}
	void setColor(String color) {
		this.color = color;
	}
	abstract double perimeter() throws GeometricException ;
	abstract double ploshad() throws GeometricException;
	@Override abstract public String toString();
}
