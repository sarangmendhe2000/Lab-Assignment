import java.util.Scanner;
class Max3Number{
public static void main(String[] args)
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int a=sc.nextInt();
System.out.println("Enter number");
int b=sc.nextInt();
System.out.println("Enter number");
int c=sc.nextInt();
if((a==b) && (a==c)){
	
	System.out.println("All are Equals");
}else
{
	if((a>b) && (a>c))
	{
		System.out.println("A is greter");
	}
	if else((b>c) && (b>a))
	{
		System.out.println("B is greter");
		
	}
	else
	{
		System.out.println("C is greter");
	}
	
	
	
}








}