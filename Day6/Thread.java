
package Day6;

//import java.util.Map;

public class Task4_Basic {
	public class Main extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Haiiii Thread"+" "+i);
		}
	}
}
class Execute{
	public static void main(String[] args) {
		Main m = new Main();
		m.start();
	}
	}
}
