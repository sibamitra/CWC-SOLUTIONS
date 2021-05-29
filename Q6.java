public class Q6 {
 public static int max(int a,int b,int c) {
  if(a>b && a>c) 
	  return a;
  if(b>a && b>c)
	  return b;
  else {
	  return c; 
 }
 }

 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int res=max(41,121,13);
  System.out.println("The maximum of three numbers is:"+res);

 }

}