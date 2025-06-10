package Day4;
   //Method OverRiding
class Laptop1 {
	void os() {
		System.out.println("Windows 10");
	}
}
class update extends Laptop1{
	void os(){
		System.out.println("Window 11");
	}
}
public class Laptop {
	public static void main(String []args) {
		update u=new update();
		u.os();
	}
}