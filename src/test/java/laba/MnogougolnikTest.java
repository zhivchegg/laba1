package laba;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import laba.*;

public class MnogougolnikTest {
	@Test
	public void test() throws GeometricException {
		Mnogougolnik m = new Mnogougolnik();
		m.addPoint(0, new Point(0, 0));
		m.addPoint(0, new Point(1, 0));
		m.addPoint(0, new Point(1, 1));
		m.addPoint(0, new Point(-1, 1));
		assertEquals(1.5, m.ploshad(), 0.00001);
		assertEquals(4 + java.lang.Math.sqrt(2), m.perimeter(), 0.00001);
	}
}
