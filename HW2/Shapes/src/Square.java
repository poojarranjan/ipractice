public class Square extends Shape
{
	private int length;

	public Square(int l)
       {
         super();
         length=l;

       }

	public void calcArea(){
		area =length * length;
	}
	public void calcPerimeter(){
		perimeter = 4*length;
	}
	public String toString(){
		return "Shape you have selected is: Square\n\nSide Length = " + length + super.toString();
	}



}
