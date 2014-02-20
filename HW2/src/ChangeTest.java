//import org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class ChangeTest {
@Test
	public void testpath1()
	{
		//assertEquals(40, Change.changeCalc(60, 100)); 
	int[] expecteds = {40,0,0,0,0};
	System.out.println(expecteds[0]);
	Assert.assertEquals(expecteds, Change.changeCalc(100,60) );
	}
}
