package Day2;
import java.util.Random;
import java.util.Scanner;
public class OTP {
       public static int OTP() {
    	   Random ran=new Random();
    	   return 1000+ran.nextInt(5000);
       }
       public static void main(String[]args) {
    	   Scanner in=new Scanner(System.in);
    	   long num =in.nextLong();
    	   long a=1234567890;
    	   if(num==a) { 	 
    		   System.out.println("VERIFIED....!");
    	   int OTP=OTP();
    	       System.out.println("ONE TIME PASSWORD IS:"+OTP);
    	  
    	   } else {
    		   System.out.println("INAVAILD..!");
    	   }
       }
}
