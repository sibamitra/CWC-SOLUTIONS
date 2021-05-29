import java.util.Scanner;
public class Q10 {

    public static void main(String[] args) {
        System.out.println("Enter your Number : ");
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String a=String.valueOf(d);
        System.out.println(a+ " + "+ a+a +" + " +a+a+a+ " = "+ ((Integer.parseInt(a))+(Integer.parseInt(a+a))+ (Integer.parseInt(a+a+a))));
}
}