package Day4;

abstract class Program1 {
	abstract void m1();
	}
	class display extends Program1{ 
		void m1() {
			System.out.println("Java");
		}
	}
	class Main{
	public static void main(String [] args) {
		display d=new display(); 
			  d.m1();
	}
		  }


