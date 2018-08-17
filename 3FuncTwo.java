import java.util.*;
public class threeFuncTwo {
	void func(int x,int y)
	{
		int c=x+y;
		System.out.println("The addition is "+c);
        
	}

	public static void main(String[] args) {
		threeFuncTwo object = new threeFuncTwo();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		object.func(a,b);
		s.close();

	}

}
