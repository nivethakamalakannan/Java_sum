import java.util.*;
public class threeFuncOne {
	void func()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		int c=a+b;
		System.out.println("The addition is "+c);
        s.close();
	}
	public static void main(String[] args) {
		
		threeFuncOne object = new threeFuncOne();
		object.func();

	}

}
