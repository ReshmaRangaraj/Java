package Day6;

import java.util.HashSet;

public class Task2 {
	public static void main(String[] args) {
		HashSet<String> studentmail=new HashSet();
		studentmail.add("Reshu@gmail.com");
		studentmail.add("Rakshu@gmail.com");
		for(String data:studentmail) {
			System.out.println(data);
		}
	}
}
