package laba;

import laba.*;

public class Circumference extends Figure {
	private Point center;
	private double radius;
	@Override public String toString() {
		return "Circumference " + center.toString() + " " + Double.toString(radius);
	}
	Circumference(Point center, double radius) {
		this.center = center;
		this.radius = radius;
	}
	@Override double ploshad() {
		return java.lang.Math.PI * (radius * radius);
	}
	@Override double perimeter() {
		return java.lang.Math.PI * radius * 2;
	}
}
