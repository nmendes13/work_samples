package UnitTest;

import static org.junit.Assert.*;
import org.junit.Test;
import FizzBuzz.FizzBuzz;

public class FizzBuzzTestCases {

	private FizzBuzz fizzBuzz= new FizzBuzz(1, 20);
	@Test
	public void testFizz() {		
		assertEquals(true, fizzBuzz.isFizz(3));
		assertEquals(true, fizzBuzz.isFizz(6));
		assertEquals(false, fizzBuzz.isFizz(1));
	}
	@Test
	public void testBuzz() {		
		assertEquals(true, fizzBuzz.isBuzz(5));
		assertEquals(true, fizzBuzz.isBuzz(10));
		assertEquals(false, fizzBuzz.isBuzz(3));
	}
	@Test
	public void testFizzBuzz() {		
		assertEquals(true, fizzBuzz.isFizzBuzz(15));
		assertEquals(false, fizzBuzz.isFizzBuzz(5));
		assertEquals(false, fizzBuzz.isFizzBuzz(2));
	}
	@Test
	public void testLucky() {
		assertEquals(true, fizzBuzz.isLucky(3));
		assertEquals(true, fizzBuzz.isLucky(13));
		assertEquals(false, fizzBuzz.isLucky(10));
	}
}
