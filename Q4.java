
import java.util.Scanner;  
public class Q4
{  
public static void main(String args[])  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter a number to check: ");  
int l= sc.nextInt();  
int c=0;  
int q = l*l;  
int g = l;     
while(g>0)  {  
c++;  
g=g/10;  
}   
int b = (int)(q%(Math.pow(10, c)));   
if(l ==b) {
System.out.println(l+ " is an automorphic number.");
}
else  {
System.out.println(l + " is not an automorphic number.");  
}  
}
}
