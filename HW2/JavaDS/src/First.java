import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class First {
	
	int[][] array = new int[][]{
			{1,2,3,4},
			{5,6,7,8},
			{9,10,0,12},
			{13,0,15,16}
	};
	
	private List zeroIndexes = new ArrayList();
	
	public void printArray(){
		
		System.out.println("Printing Array");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("\t"+array[i][j]);
			}
			System.out.println();
		}
	}
	
	public void fillArrayForZeroValues(){
		for (Iterator iter = zeroIndexes.iterator(); iter.hasNext();) {
			ArrayIndex element = (ArrayIndex) iter.next();
			int row = element.getRow();
			int column = element.getColumn();
			for (int i = 0; i < array[row].length; i++) {
				array[row][i]=0;
			}
			for (int i = 0; i < array.length; i++) {
				array[i][column]=0;
			}
		}
	}
	
	public void findZeroIndexes(){
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(array[i][j]==0){
					zeroIndexes.add(new ArrayIndex(i,j));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		First finder = new finder();
		finder.printArray();
		finder.findZeroIndexes();
		finder.fillArrayForZeroValues();
		finder.printArray();
	}
	
}
class ArrayIndex{
	
	private int row;
	private int column;
	
	public ArrayIndex(int row,int column){
		this.row=row;
		this.column = column;
	}

	public int getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}
	
	
}
