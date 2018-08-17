import java.util.Scanner;
public class threeFuncFour {
	int func(int x, int y)
	{
		
		
		int c=x+y;
		return(c);
	}
	
	public static void main(String[] args) {
		int answer;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = s.nextInt();
		int b = s.nextInt();
		threeFuncFour object = new threeFuncFour();
		answer = object.func(a,b);
		System.out.println("The addition is "+answer);
		s.close();

	}

}
