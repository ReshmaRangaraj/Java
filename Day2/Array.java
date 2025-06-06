package Day2;

public class Array {
      public static void main(String[] args) {
    	  int [] number = new int [7];
    	  number[0]=1;
    	  number[1]=2;
    	  number[2]=3;
    	  number[3]=4;
    	  number[4]=5;
    	  number[5]=6;
    	 number[6]=7;
    	 //int[] number = {1,2,3,4,5};
    	  System.out.println(number[5]);
    	  System.out.println(number.length);
    	 // for(int i=0;i<=number.length-1;i++) {
    	//	  System.out.println(number[i]);
    	 
// reverse number
	for(int i=number.length-1;i>=0;i--) {
		System.out.println(number[i]);
	}
}
      }