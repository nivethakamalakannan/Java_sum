public class fiveConstruct {
    int valuec=0,valuea,valueb;   
	fiveConstruct(int a, int b)
	{
		 valuea = a ;
		 valueb = b ;
		System.out.println("1st constructor");
	}
	
	fiveConstruct(int a, int b, int c)
	{
		 valuea = a;
		 valueb = b;
		 valuec = c;
		System.out.println("2nd constructor");
	}
	
	void add()
	{
		int c;
		c=valuea+valueb+valuec;
		System.out.println("The addition is "+c);
		
	}
	public static void main(String[] args) {
		fiveConstruct obj1 = new fiveConstruct(5,15);
		fiveConstruct obj2 = new fiveConstruct(5,15,10);
		obj1.add();
		obj2.add();

	}

}
