package Day4;
import java.util.ArrayList;
public class ArrayListExample {
	public static void main (String[] args) {
		ArrayList<Integer> arr=new ArrayList();
		ArrayList<Object> arr2=new ArrayList();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.forEach(num->System.out.println(num*num));
	
		arr2.add("Haii....Java");
		System.out.println(arr);
		System.out.println(arr2);
	}

}
