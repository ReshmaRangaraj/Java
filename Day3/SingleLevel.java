package Day3;

		//Super class:
public class SingleLevel {
	void message() {
		System.out.println("Sending..!!");
    }
}
class subclass extends SingleLevel{
void view () {
	 System.out.println("Received...!");
}
}
class main{
	public static void main(String [] args) {
		subclass ref=new subclass();
		ref.message();
		ref.view();
		
	}
}	
