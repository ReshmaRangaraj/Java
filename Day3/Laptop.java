package Day3;
	//constructor
public class Laptop {
	String model;
	int size;
	
	Laptop(String model,int size){
		this.model=model;
		this.size=size;
	}
	void display() {
		  
		  System.out.println("lap"+ " "+model + " " +size);
	  }
	  public static void main(String[]args) {
		 Laptop r =new Laptop("abc", 45);
		  r.display();
	  }
}
