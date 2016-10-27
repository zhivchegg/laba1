package laba;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import laba.*;

public class PointTest {
	@Test
	public void test() {
		Point p1 = new Point(0, 0);
		Point p2 = new Point(2, 2);
		assertEquals(java.lang.Math.sqrt(8), p1.distanceTo(p2), 0.00001);
	}
}
