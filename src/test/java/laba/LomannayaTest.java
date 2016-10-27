package laba;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import laba.*;

public class LomannayaTest {
	@Test
	public void test() throws GeometricException {
		Lomannaya l = new Lomannaya();
		l.addPoint(0, new Point(0, 0));
		l.addPoint(0, new Point(1, 1));
		l.addPoint(0, new Point(0, 1));
		assertEquals(1 + java.lang.Math.sqrt(2), l.perimeter(), 0.00001);
	}
}
