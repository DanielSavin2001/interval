import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {

	@Test
	void test() {
		Interval mijnInterval = new Interval(0, 2);
		mijnInterval.setOndergrens(-3);
		mijnInterval.setBreedte(5);
		int lengte = mijnInterval.getLengte();
		assert lengte == 5;
		assertThrows(IllegalArgumentException.class, () -> {
			mijnInterval.setBreedte(-5);
		});
		assertEquals(-3, mijnInterval.getOndergrens());
		assertEquals(5, mijnInterval.getLengte());
		System.out.println("test");
	}

}