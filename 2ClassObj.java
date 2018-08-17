import java.util.*;
public class twoClassObj {
	int a,b;
	
	public static void main(String[] args) {
		twoClassObj object = new twoClassObj();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		object.a = s.nextInt();
		object.b = s.nextInt();
		int c=object.a+object.b;
		System.out.println("The addition is "+c);
        s.close();
	}
}
