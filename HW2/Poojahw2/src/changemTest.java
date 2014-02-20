import static org.junit.Assert.*;

import org.junit.Test;

public class changemTest {
	@Test
	public void path1()
	{

int [] p1={1,1,1,1,1};
assertEquals(p1, changem.changeCalc(401.41, 400));

	}
	
	@Test
	public void path2()

	{
		int [] p2={0,1,1,1,1};
		assertEquals(p2, changem.changeCalc(400.41, 400));
	}
	
	@Test
	public void path3()

	{
		int [] p3={0,0,1,1,1};
		assertEquals(p3,changem.changeCalc(400.16, 400));
	}
	
	@Test
	public void path4()
	{
int [] p4={0,0,0,1,1};
		assertEquals(p4, changem.changeCalc(400.06, 400));
	}
	
	@Test
	public void path5()
	{
int [] p5={0,0,0,0,1};
		assertEquals(p5, changem.changeCalc(400.01, 400));
	}
	
}





