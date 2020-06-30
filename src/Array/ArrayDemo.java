package Array;

public class ArrayDemo {

	public static void main(String[] args) {
	
	int a []= new int [5];	
	
	a[0]=100;
	a[1]=200;
	a[2]=300;
	a[3]=400;
	a[4]=500;
	
	System.out.println("Length of an Array: " +a.length);
	System.out.println(a[2]);
		
	for (int i=0; i<a.length; i++)
		
	{
		System.out.println(a[i]);
	}
	

	}

}
