package pooja.ranjan.SQAT.hw2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class ChangeTest {
	
	/* These test cases are meant to test the ChangeCalc () function as it performs the same function
	 *  as the main
	 */
	@Test
	// Checking all the positions of the array when no change is to be rendered
	public void tst1a()
	{
	
		assertEquals(0, Change.changeCalc(40, 40)[0]);
	}

	@Test

	public void tst1b()
	{
	
		assertEquals(0, Change.changeCalc(40, 40)[1]);
	}
	@Test
	public void tst1c()
	{
	
		assertEquals(0, Change.changeCalc(40, 40)[2]);
	}
	@Test
	
	public void tst1d()
	{
	
		assertEquals(0, Change.changeCalc(40, 40)[3]);
	}
	@Test
	public void test1e()
	{
	
		assertEquals(0, Change.changeCalc(40, 40)[4]);
	}
	
	@Test
	//Regular case where the given amount is greater than the actual cost
	public void tst2()
	{
	
		assertEquals(360, Change.changeCalc(460, 100)[0]);
	}
	
	
	
	@Test
	//Invalid case where amount given is less than actual cost
	public void tst3()
	{
		assertEquals(-1, Change.changeCalc(20, 120)[0]);
	}
	@Test
	//Regular case where the amount given and that to be returned contains all coins
	//First for leftover dollars
	public void tst4a()
	{
		assertEquals(1, Change.changeCalc(101.68,100 )[0]);
	}
	@Test
	//Checking for leftover quarters
	public void tst4b()
	{
		assertEquals(2, Change.changeCalc(101.68,100 )[1]);
	}
	
	@Test
	//Checking for leftover dimes
	public void tst4c()
	{
		assertEquals(1, Change.changeCalc(101.68,100 )[2]);
	}
	@Test
	//Checking for leftover nickels
	public void tst4d()
	{
		assertEquals(1, Change.changeCalc(101.68,100 )[3]);
	}
	@Test
	//Checking for leftover pennies
	public void tst4e()
	{
		assertEquals(3, Change.changeCalc(101.68,100 )[4]);
	}
	

	
}
