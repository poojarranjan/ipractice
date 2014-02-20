import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;

public class BagelTest {
	
	
	public static calculations calcObject;
	
	public static boolean[] topping;
	public double bill[];
	
		
	@Test
	public void testGetBagelCost()
	{
		calcObject= new calculations();
		assertEquals(1.25,calcObject.getBagelCost("white"),0);
	}
	
	@Test
	public void testBagelCostNegative()
	{
		calcObject= new calculations();
		assertEquals(1.5,calcObject.getBagelCost("Random String"),0);
	}
	
	@Test
	public void testbagelCostZero()
	{
		calcObject= new calculations();
		assertEquals(1.5,calcObject.getBagelCost(""),0);
	}
	
	@Test
	public void testGetCoffeeCost()
	{
		calcObject= new calculations();
		assertEquals(0.00, calcObject.getCoffeeCost(1),0);
	}
	
	@Test
	public void testGetCoffeeCost2()
	{
		calcObject= new calculations();
		assertEquals(1.25, calcObject.getCoffeeCost(2),0);
	}
	
	@Test
	public void testGetCoffeeCost3()
	{
		calcObject= new calculations();
		assertEquals(1.25, calcObject.getCoffeeCost(3),0);
	}
	
	@Test
	public void testGetCoffeeCost4()
	{
		calcObject= new calculations();
		assertEquals(2.00, calcObject.getCoffeeCost(4),0);
	}
	
	@Test
	public void testGetCoffeeCost5()
	{
		calcObject= new calculations();
		assertEquals(2.00, calcObject.getCoffeeCost(2000),0);
	}
	
	@Test
	public void testGetCoffeeCost6()
	{
		calcObject= new calculations();
		assertEquals(2.00, calcObject.getCoffeeCost(0),0);
	}
	
	@Test
	public void testGetCoffeeCost7()
	{
		calcObject= new calculations();
		assertEquals(2.00, calcObject.getCoffeeCost(-1),0);
	}
	
	@Test
	public void testGetToppingCost()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		assertEquals((0), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost1()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		assertEquals((0.5), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost2()
	{
		calcObject= new calculations();
boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=true;
		topping[2]=false;
		topping[3]=false;
		assertEquals((0.25), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost3()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=true;
		
		topping[3]=false;
		assertEquals((0.75), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost4()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=true;
		assertEquals((0.75), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost5()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=true;
		topping[2]=false;
		topping[3]=false;
		assertEquals((0.75), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost6()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=false;
		topping[2]=true;
		topping[3]=false;
		assertEquals((1.25), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost7()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=false;
		topping[2]=false;
		topping[3]=true;
		assertEquals((1.25), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost8()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=true;
		topping[2]=true;
		topping[3]=false;
		assertEquals((1.0), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost9()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=true;
		topping[2]=false;
		topping[3]=true;
		assertEquals((1.0), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost10()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=true;
		topping[3]=true;
		assertEquals((1.5), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost11()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=true;
		topping[2]=true;
		topping[3]=false;
		assertEquals((1.5), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost12()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=true;
		topping[2]=false;
		topping[3]=true;
		assertEquals((1.5), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost13()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=false;
		topping[2]=true;
		topping[3]=true;
		assertEquals((2.0), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetToppingCost14()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=true;
		topping[2]=true;
		topping[3]=true;
		assertEquals((2.25), calcObject.getToppingCost(topping),0);
	}
	
	@Test
	public void testGetTheBill1()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {0.0,1.25,0.0,0.075,1.325};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 1, topping), 0);
		
	}
	
	@Test
	public void testGetTheBill2()
	{
		
		
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {0.0,1.25,0.5,0.105,1.855};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 1, topping), 0);
	}

	@Test
	public void testGetTheBill3()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=true;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {0.0,1.25,0.25,0.09,1.59};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 1, topping), 0);
	}
	
	@Test
	public void testGetTheBill4()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=true;
		topping[3]=false;
		
		
		double[] returned_array = {0.0,1.25,0.75,0.12,2.12};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 1, topping), 0);
	}
	
	@Test
	public void testGetTheBill5()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=true;
		
		
		double[] returned_array = {0.0,1.25,0.75,0.12,2.12};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 1, topping), 0);
	}
	
	@Test
	public void testGetTheBill6()
	{
		calcObject= new calculations();
		boolean topping[] = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {0.0,1.50,0.0,0.09,1.59};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 1, topping), 0);
	}
	
	@Test
	public void testGetTheBill7()
	{
		calcObject= new calculations();
		boolean topping[] = {false,false,false,false};
		topping[0]=true;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {0.0,1.50,0.5,0.12,2.12};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 1, topping), 0);
	}

	@Test
	public void testGetTheBill8()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=true;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {0.0,1.5,0.25,0.105,1.855};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 1, topping), 0);
	}
	
	@Test
	public void testGetTheBill9()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=true;
		topping[3]=false;
		
		
		double[] returned_array = {0.0,1.5,0.75,0.135,2.385};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 1, topping), 0);
	}
	
	@Test
	public void testGetTheBill10()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=true;
		
		
		double[] returned_array = {0.0,1.50,0.75,0.135,2.385};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 1, topping), 0);
	}
	
	@Test
	public void testGetTheBill11()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.25,0.0,0.15,2.65};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 2, topping), 0);
	}
	
	@Test
	public void testGetTheBill12()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.25,0.5,0.18,3.18};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 2, topping), 0);
	}

	@Test
	public void testGetTheBill13()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=true;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.25,0.25,0.165,2.915};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 2, topping), 3);
	}
	
	@Test
	public void testGetTheBill14()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=true;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.25,0.75,0.195,3.445};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 2, topping), 0);
	}
	
	@Test
	public void testGetTheBill15()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=true;
		
		
		double[] returned_array = {1.25,1.25,0.75,0.195,3.445};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 2, topping), 0);
	}
	
	@Test
	public void testGetTheBill16()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.50,0.0,0.165,2.915};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 2, topping), 3);
	}
	
	@Test
	public void testGetTheBill17()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.50,0.5,0.195,3.445};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 2, topping), 0);
	}

	@Test
	public void testGetTheBill18()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		
		topping[0]=false;
		topping[1]=true;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.5,0.25,0.18,3.18};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 2, topping), 0);
	}
	
	@Test
	public void testGetTheBill19()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=true;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.5,0.75,0.21,3.71};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 2, topping), 0);
	}
	
	@Test
	public void testGetTheBill20()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=true;
		
		
		double[] returned_array = {1.25,1.50,0.75,0.21,3.71};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 2, topping), 0);
	}
	
	@Test
	public void testGetTheBill21()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.25,0.0,0.15,2.65};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 3, topping), 0);
	}
	
	@Test
	public void testGetTheBill22()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.25,0.5,0.18,3.18};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 3, topping), 0);
	}

	@Test
	public void testGetTheBill23()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=true;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.25,0.25,0.165,2.915};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 3, topping), 3);
	}
	
	@Test
	public void testGetTheBill24()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=true;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.25,0.75,0.195,3.445};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 3, topping), 0);
	}
	
	@Test
	public void testGetTheBill25()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=true;
		
		
		double[] returned_array = {1.25,1.25,0.75,0.195,3.445};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 3, topping), 0);
	}
	
	@Test
	public void testGetTheBill26()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.50,0.0,0.165,2.915};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 3, topping), 3);
	}
	
	@Test
	public void testGetTheBill27()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.50,0.5,0.195,3.445};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 3, topping), 0);
	}

	@Test
	public void testGetTheBill28()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=true;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.5,0.25,0.18,3.18};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 3, topping), 0);
	}
	
	@Test
	public void testGetTheBill29()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=true;
		topping[3]=false;
		
		
		double[] returned_array = {1.25,1.5,0.75,0.21,3.71};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 3, topping), 0);
	}
	
	@Test
	public void testGetTheBill30()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=true;
		
		
		double[] returned_array = {1.25,1.50,0.75,0.21,3.71};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 3, topping), 0);
	}

	@Test
	public void testGetTheBill30_1()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=true;
		
		
		double[] returned_array = {1.25,1.50,0.75,0.21,3.71};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 2, topping), 0);
	}
	
	@Test
	public void testGetTheBill31()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {2.00,1.25,0.0,0.195,3.445};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 4, topping), 0);
	}
	
	@Test
	public void testGetTheBill32()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {2.00,1.25,0.5,0.225,3.975};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 4, topping), 3);
	}

	@Test
	public void testGetTheBill33()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=true;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {2.00,1.25,0.25,0.21,3.71};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 4, topping), 3);
	}
	
	@Test
	public void testGetTheBill34()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=true;
		topping[3]=false;
		
		
		double[] returned_array = {2.00,1.25,0.75,0.24,4.24};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 4, topping), 0);
	}
	
	@Test
	public void testGetTheBill35()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=true;
		
		
		double[] returned_array = {2.00,1.25,0.75,0.24,4.24};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 4, topping), 0);
	}
	
	@Test
	public void testGetTheBill36()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {2.00,1.50,0.0,0.21,3.71};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat",4, topping), 3);
	}
	
	@Test
	public void testGetTheBill37()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=false;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {2.00,1.50,0.5,0.24,4.24};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 4, topping), 0);
	}

	@Test
	public void testGetTheBill38()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=true;
		topping[2]=false;
		topping[3]=false;
		
		
		double[] returned_array = {2.00,1.5,0.25,0.225,3.975};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 4, topping), 3);
	}
	
	@Test
	public void testGetTheBill39()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=false;
		topping[1]=false;
		topping[2]=true;
		topping[3]=false;
		
		
		double[] returned_array = {2.00,1.5,0.75,0.255,4.505};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 4, topping), 0);
	}
	
	@Test
	public void testGetTheBill40()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false}; 
		topping[0]=false;
		topping[1]=false;
		topping[2]=false;
		topping[3]=true;
		
		
		double[] returned_array = {2.00,1.50,0.75,0.255,4.505};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 4, topping), 0);
	}
	
	@Test
	public void testGetTheBill41()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=true;
		topping[2]=true;
		topping[3]=true;
		
		
		double[] returned_array = {2.00,1.50,2.25,0.345,6.095};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("wheat", 4, topping), 0);
	}
	
	@Test
	public void testGetTheBill42()
	{
		calcObject= new calculations();
		boolean[] topping = {false,false,false,false};
		topping[0]=true;
		topping[1]=true;
		topping[2]=true;
		topping[3]=true;
		
		
		double[] returned_array = {2.00,1.25,2.25,0.345,6.095};
		
		assertArrayEquals(returned_array, calcObject.gettheBill("white", 4, topping), 3);
	}
	@AfterClass
	public static void del()
	{
		calcObject=null;
	}
	
}
