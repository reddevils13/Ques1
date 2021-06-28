import static org.junit.Assert.*;

import org.junit.Test;

public class CheckEvenTest {

	@Test
	public void test1() {
		CheckEven obj = new CheckEven();
		assertEquals(obj.check(10), true);
	}
	
	@Test
	public void test2() {
		CheckEven obj = new CheckEven();
		assertEquals(obj.check(13), false);
	}
	
	@Test
	public void test3() {
		CheckEven obj = new CheckEven();
		assertEquals(obj.check(7), false);
	}

}
