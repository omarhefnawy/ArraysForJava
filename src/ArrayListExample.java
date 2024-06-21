import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
// copy fruits in arraylist
	
 static	void copyArr  (ArrayList <String> list , String [] fruits)
 {
	 Collections.addAll(list, fruits);
	 
 }
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ArrayList <String> list = new ArrayList <>();
   String [] fruits = {"Banana , Apple , Mango "};
   String [] juice = {"milk","Mango","Apple","grape"};
   copyArr(list,fruits);
   copyArr(list,juice);
   System.out.println(list+"\n"+list.get(0));
   
	}

}
