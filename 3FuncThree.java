import java.util.Scanner;

public class threeFuncThree {
	int func()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();
		int c=a+b;
		return(c);
		
        
	}

	public static void main(String[] args) {
		int answer;
		threeFuncThree object = new threeFuncThree();
		answer = object.func();
		System.out.println("The addition is "+answer);

	}

}
