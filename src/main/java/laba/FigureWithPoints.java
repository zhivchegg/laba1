package laba;

import laba.*;
import java.util.*;

abstract public class FigureWithPoints extends Figure {
	private ArrayList<Point> points = new ArrayList<Point>();
	void addPoint(int index, Point point) throws GeometricException {
		if (points.contains(point))
			throw new GeometricException();

		points.add(index, point);
	}
	public void removePoint(int index) {
		points.remove(index);
	}
	public Point getPoint(int index) {
		return points.get(index);
	}
	public int countOfPoints() {
		return points.size();
	}
	public String stringOfPoints() {
		if (points.size() < 1)
			return "";
		String pointsString = getPoint(0).toString();
		for (int i = 1, n = countOfPoints(); i < n; i++) {
			pointsString += " - " + getPoint(i).toString();
		}
		return pointsString;
	}
}
