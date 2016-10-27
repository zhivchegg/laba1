package laba;

import laba.*;

public class Lomannaya extends FigureWithPoints {
	@Override public String toString() {
		return "Lomannaya " + stringOfPoints();
	}
	@Override public double perimeter() throws GeometricException {
		final int n = countOfPoints() - 1;
		if (n < 2)
			throw new GeometricException();
		double per = 0;
		for (int i = 0; i < n; i++) {
			per += getPoint(i).distanceTo(getPoint(i+1));
		}
		return per;
	}
	@Override public double ploshad() throws GeometricException {
		throw new GeometricException();
	}
}
