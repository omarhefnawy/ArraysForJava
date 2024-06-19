import java.util.Arrays;
import java.util.Scanner;

public class array2D {
	// nested for
		static void showByNestedLoop(int [][] array)
		{
			for (int row=0 ; row<array.length;row++)
			{
				//System.out.println("Enter Values for Raw"+(row+1));
				for(int col=0 ; col<array[row].length; col++  )
				{
				System.out.print(array[row][col]+" ");
				}
				System.out.print("\n");
			}	
		}
 // input array
	static void InputValues (int [][] array,Scanner scanner)

	{
		for (int row=0 ; row<array.length;row++)
		{
			System.out.println("Enter Values for Raw"+(row+1));
			for(int col=0 ; col<array[row].length; col++  )
			{
			array[row][col]=scanner.nextInt();	
			}
		}
	}
	// 
	// ForEach
	static void ShowByForEach (int [][] array)

	{
		for (int[] arr :array)
		{
			System.out.println(Arrays.toString(arr));
		}
	}
	
	
	/// show by tostring arrray
	static void arraytostring(int [][] array)
	{
		for (int i=0; i<array.length;i++)
		{
			System.out.println(Arrays.toString (array[i]) );
		}
	}
	//////////////////////////////////////////////////////////////////////////////// MAIN YA MEALEM
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int [][] Array= new int [3][3];
   Scanner scanner = new Scanner(System.in);
   //input values
   InputValues(Array,scanner);
   // nested for loop
   showByNestedLoop(Array);
   ///// for each
	ShowByForEach (Array);
	/// to string
	arraytostring(Array);
	}
	
     
}
