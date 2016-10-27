package laba;

public class Point {
	double x;
	double y;
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	@Override public String toString() {
		return "Point(" + Double.toString(x) + ", " + Double.toString(y) + ")";
	}
	@Override public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (!Point.class.isAssignableFrom(obj.getClass()))
			return false;

		final Point otherPoint = (Point)obj;
		if (otherPoint.x == this.x && otherPoint.y == this.y)
			return true;

		return false;
	}
	double distanceTo(Point point) {
		return java.lang.Math.hypot(this.x - point.x, this.y - point.y);
	}
}
