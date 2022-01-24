package lab8A;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTestBlackBox {

	@SuppressWarnings("static-access")
	@Test
	void test1() {
		Main m = new Main();
		assertEquals(1, m.absoluteValueOf(1));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void test2() {
		Main m = new Main();
		assertEquals(5, m.absoluteValueOf(-5));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void test3() {
		Main m = new Main();
		assertEquals(17, m.absoluteValueOf(17));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void test4() {
		Main m = new Main();
		assertEquals(256, m.absoluteValueOf(-256));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void test5() {
		Main m = new Main();
		assertEquals(42, m.absoluteValueOf(42));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void test6() {
		Main m = new Main();
		assertEquals(0, m.absoluteValueOf(-0));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void test7() {
		Main m = new Main();
		assertEquals(83765, m.absoluteValueOf(83765));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void test8() {
		Main m = new Main();
		assertEquals(2022, m.absoluteValueOf(-2022));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void test9() {
		Main m = new Main();
		assertEquals(70, m.absoluteValueOf(70));
	}
	
	@SuppressWarnings("static-access")
	@Test
	void test10() {
		Main m = new Main();
		assertEquals(35, m.absoluteValueOf(-35));
	}

}
