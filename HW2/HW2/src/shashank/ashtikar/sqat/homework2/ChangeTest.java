package shashank.ashtikar.sqat.homework2;

import org.junit.Test;

import static org.junit.Assert.*;




public class ChangeTest {
	@Test
	//Normal case where the amount given is greater than the actual cost
	public void test1()
	{
	
		assertEquals(60, Change.changeCalc(160, 100)[0]);
	}
	
	
	//Incorrect case where amount given is less than actual cost
	@Test
	public void test2()
	{
		assertEquals(-1, Change.changeCalc(90, 120)[1]);
	}
	@Test
	//Checking for dollars left
	public void test3()
	{
		assertEquals(4, Change.changeCalc(204.43,200 )[0]);
	}
	@Test
	//Checking for quarters left
	public void test4()
	{
		assertEquals(1, Change.changeCalc(204.43,200 )[1]);
	}
	
	@Test
	//Checking for dimes left
	public void test5()
	{
		assertEquals(1, Change.changeCalc(204.43,200 )[2]);
	}
	@Test
	//Checking for nickels left
	public void test6()
	{
		assertEquals(1, Change.changeCalc(204.43,200 )[3]);
	}
	@Test
	//Checking for pennies left
	public void test8()
	{
		assertEquals(3, Change.changeCalc(204.43,200 )[4]);
	}
	@Test
	// case for dollars where the amount given is equal to the actual cost
	public void test9()
	{
	
		assertEquals(-1, Change.changeCalc(100, 100)[0]);
	}
	
	@Test
	//when both amount paid and cost are equal, test for quarters left
	public void test10()
	{
	
		assertEquals(-1, Change.changeCalc(100, 100)[1]);
	}
	
	@Test
	//when both amount paid and cost are equal, test for dimes left
	public void test11()
	{
	
		assertEquals(-1, Change.changeCalc(100, 100)[2]);
	}

	@Test
	// when both amount paid and cost are equal, test for nickels
	public void test12()
	{
	
		assertEquals(-1, Change.changeCalc(100, 100)[3]);
	}
	@Test
	// when both amount paid and cost are equal, test for pennies
	public void test13()
	{
	
		assertEquals(-1, Change.changeCalc(100, 100)[4]);
	}
	
	
	
}
