import java.util.Arrays;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] list= {1,234,6,776,7,6,55,676,78,7,7};
    Reverse(list);
    System.out.println(Arrays.toString(list));
	
	}
   static void Reverse(int[] list) {
		// TODO Auto-generated method stub
		int Start=0;
		int End= list.length-1;
		while(Start<End)
		{
			Swap(list,Start,End);
			Start++;
			End--;
		}
	}
   
 static void Swap(int[]list,int start, int end) {
	// TODO Auto-generated method stub
	int temp=list[start];
	list[start]=list[end];
	list[end]=temp;
}
	

}
