package Program;

public class Constructor {
	String language;
	String name;
	int year;
	
	
  Constructor( String name,int year,String lang){
	  this.name=name;
	  this.year=year;
	  this.language =language;
  }
  
  		// copy constructor, 
  Constructor(Constructor copy){
	  this.name=copy.name;
	  this.year=copy.year;
	  this.language=copy.language;
	  
  }
  void display() {
	  
	  System.out.println("Userdefine constructor"+" "+name + " " +year);
  }
  public static void main(String[]args) {
	  Constructor r =new Constructor("JAVA", 1995," Programming");
	  r.display();
	  Constructor r1=new Constructor(r);
	  System.out.println(" COPY CONSTRUCTOR");
	  r1.display();
	  
	   
	  
	
}
  
	                
	}

