package test;

public class triangle {

	public static void main(String[] args) {
		int x=1;
		int y=2;
		int z=2;
	triangle (x,y,z);   
	
	
	}
	public static int triangle (int a, int b,int c)
	{
		int i;
		if (a+b>c && b+c>a && a+c>b)
	    {	
	    	if(a == b && b == c)
	    	{
	    		i=1;
	    		System.out.println("It is Equilateral");
	    		return i;
	    		
	    	}
	    	else if ((a == b && a != c) || (a == c && a != b) ||(c == b && a != c))
	    	{
	    		i=2;
	    		System.out.println("It is Isosceles");
	    		return i;
	    	}
	    	
	    	else 
	    	{
	    		i=3;
	    		System.out.println("It is Scalene");
	    		return i;
	    	}
	    }
	    
	    else
	    {
	    	i=4;
	    	System.out.println("It is not a Triangle");
	    	return i;
	    }
	}

}
