package Day4;
import java.io.*;
import java.io.IOException;
public class Task3 {
	public static void main(String[] args){
		try {
			FileWriter myWrite=new FileWriter("C:\\Users\\TEMP\\Desktop\\Java_Addon\\123.txt");
			myWrite.write("file in java mightbr tricky");
			myWrite.close();
			System.out.println("Successfully");
		}catch (IOException e) {
			System.out.println("An error occurred");
			e.printStackTrace();
			
	      }
		}
	}
