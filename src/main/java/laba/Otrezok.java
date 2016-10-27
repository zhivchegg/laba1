package laba;

import laba.*;

public class Otrezok extends Figure {
	private Point begin;
	private Point end;

	@Override public String toString() {
		return "Otrezok " + begin.toString() + " - " + end.toString();
	}
	public Otrezok(Point begin, Point end) throws GeometricException {
		if (begin == end) 
			throw new GeometricException();

		this.begin = begin;
		this.end = end;
	}
	
	@Override double ploshad() throws GeometricException {
		throw new GeometricException();
	}
	@Override double perimeter(){
		return begin.distanceTo(end);
	}
	
}
