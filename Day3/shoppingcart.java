package Day3;
 	//Method Loading
public class shoppingcart {
	void  add_to_cart(String category,int price) {
		 System.out.println("Your category:=>"+category);
		 System.out.println("Item price:=>" + price);
	 }
void add_to_cart(String category,int price ,int quantity) {
	int total=price * quantity;
	System.out.println(total);
}
	 public static void main(String []args) {
		 shoppingcart in=new shoppingcart();
		 in.add_to_cart("Shirt", 250);
		 in.add_to_cart("Shirt", 250,2);
		 
	 }
}
