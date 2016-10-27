package laba;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import laba.*;

public class CircumferenceTest {
	@Test
	public void test() {
		Circumference c = new Circumference(new Point(1, 1), 3);
		assertEquals(c.toString(), "Circumference Point(1.0, 1.0) 3.0");
		assertEquals(java.lang.Math.PI * 9, c.ploshad(), 0.00001);
		assertEquals(java.lang.Math.PI * 6, c.perimeter(), 0.00001);
	}
}
