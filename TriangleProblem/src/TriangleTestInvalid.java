import static org.junit.Assert.*;

import org.junit.Test;
public class TriangleTestInvalid {
	@Test
	public void WR1() {
		assertEquals ("value of a is out of range", Triangle.Triangle_Test(-2, 5, 5));
	}
	
	@Test
	public void WR2() {
		assertEquals ("value of b is out of range", Triangle.Triangle_Test(5, -2, 2));
	}
	
	@Test
	public void WR3() {
		assertEquals ("value of c is out of range", Triangle.Triangle_Test(5, 5, -2));
	}
	
	@Test
	public void WR4() {
		assertEquals ("value of c is out of range", Triangle.Triangle_Test(5, 5, 201));
	}
	
	@Test
	public void WR5() {
		assertEquals ("value of b is out of range", Triangle.Triangle_Test(5, 201, 5));
	}

	@Test
	public void WR6() {
		assertEquals ("value of a is out of range", Triangle.Triangle_Test(201, 5, 5));
	}

	@Test
	public void WRR1() {
		assertEquals ("value of a is out of range", Triangle.Triangle_Test(-3, 4, 5));
	}
	
	@Test
	public void WRR2() {
		assertEquals ("value of b is out of range", Triangle.Triangle_Test(3, -4, 5));
	}
	
	@Test
	public void WRR3() {
		assertEquals ("value of c is out of range", Triangle.Triangle_Test(3, 4, -5));
	}
	
	@Test
	public void WRR4() {
		assertEquals ("value of c is out of range", Triangle.Triangle_Test(150,200, 250));
	}
	
	@Test
	public void WRR5() {
		assertEquals ("value of b is out of range", Triangle.Triangle_Test(150, 250,200));
	}

	@Test
	public void WRR6() {
		assertEquals ("value of a is out of range", Triangle.Triangle_Test(250,200,150));
	}

}
