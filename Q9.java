import java.util.Scanner;
public class Q9{
public static void main(String[ ] arg) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter a string : ");
String a=sc.next();
System.out.print("Reverse of a String '"+a+"' is  :");
for(int j=a.length();j>0;--j){
System.out.print(a.charAt(j-1));
}
}
} 