package laba;

import laba.*;

public class Mnogougolnik extends FigureWithPoints {
	@Override public String toString() {
		return "Mnogougolnik " + stringOfPoints();
	}
	@Override public double perimeter() throws GeometricException {
		final int n = countOfPoints();
		if (n < 3)
			throw new GeometricException();

		Point p, prevPoint = getPoint(n - 1);
		double per = 0;
		for (int i = 0; i < n; i++) {
			p = getPoint(i);
			per += prevPoint.distanceTo(p);
			prevPoint = p;
		}
		return per;
	}
	@Override public double ploshad() throws GeometricException {
		final int n = countOfPoints();
		if (n < 3)
			throw new GeometricException();
		double pl = 0;
		Point p0, p1, p2;
		
		p0 = getPoint(0);
		for (int i = 2; i < n; i++) {
			p1 = getPoint(i - 1);
			p2 = getPoint(i);
			//Площадь треугольника через векторное произведение
			pl += ((p1.x - p0.x) * (p2.y - p0.y) - (p2.x - p0.x) * (p1.y - p0.y)) / 2;
		}
		return java.lang.Math.abs(pl);
	}
}
