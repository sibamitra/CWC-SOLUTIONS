import java .util.Scanner;
public class Q3{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number till u want series");
		int k=sc.nextInt();
		int l=0,m=1,n=1;
		int p=l+m+n;
		System.out.print("The required series is :");
		System.out.print(l+" "+m+" "+n);
		for(int a=4;a<=k;a++) {
System.out.print(" "+p);
l=m;
m=n;
n=p;
p=l+m+n;
		}
		System.out.println();
	}
}
