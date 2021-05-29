import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int[]array=new int[l];
	System.out.println("Enter the elements of array");
	for(int i=0;i<l;i++) {
		array[i]=sc.nextInt();
	}System.out.println("Array elements are:");
		for(int j=0;j<l;j++) {
			System.out.println(array[j]);
		}int d=0;
		for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					d++;
				}
			}
		}
		System.out.println("The minimum number of swap required to sort an array is:"+d);
		
	}

	}


