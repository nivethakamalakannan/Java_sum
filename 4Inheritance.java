import java.util.*;
public class fourInheritance {
	int a,b;
}

class subclass extends fourInheritance {
	void func()
	{
		int c=a+b;
		System.out.println("The addition is "+c);
	}
	
	public static void main(String[] args) {
		subclass object = new subclass();
		Scanner s = new Scanner(System.in);
		object.a = s.nextInt();
		object.b = s.nextInt();
		object.func();
		s.close();

	}

}
