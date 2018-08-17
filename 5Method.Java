import java.util.*;
public class fiveMethod {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = addition(a,b);
		System.out.println("The addition is "+c);
        s.close();
		
	}
	public static int addition(int x, int y) {
		int z;
		z=x+y;
		return z;
		
		
	}

}
