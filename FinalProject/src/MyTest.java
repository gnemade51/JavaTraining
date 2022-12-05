import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyTest {

	@Test
	void test() {
		Calculation c1=new Calculation();
		assertEquals(30,c1.add(10, 20));
		assertEquals(30,c1.add(30, 20));
		assertEquals(40,c1.add(20, 20));
	}

}
