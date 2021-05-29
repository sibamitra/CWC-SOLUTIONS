public class Q5 { 
public static void main(String[]args) {
	int arr[]= {1,2,3,4,5};
	int c=0;
	System.out.print("Total inversion Pairs are:");
	for(int a=0;a<arr.length;a++) {
		for(int b=a+1;b<arr.length;b++) {
		if(arr[a]>arr[b]) {
				System.out.println(arr[a]+","+arr[b]);
			c++;
			}
	}		
}
if(c==0) 
	System.out.println("No Inversion Pair Exist");
	System.out.println("Total Count of Inversion Pair:"+c);
	}
}



