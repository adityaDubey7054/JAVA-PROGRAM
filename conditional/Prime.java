import java.util.*;
public class Prime
{
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    if(n==2){
	        System.out.println("n is Prime Number");
	    }
	    else{
	       boolean isPrime = true;
	       for(int i=2;i<n-1;i++){
	        if(n%i==0){
	            isPrime=false;
	        }
	        else{
	            if(isPrime==true){
	                System.out.println("n is Prime Number");
	            }
	            else{
	                System.out.println("n is Composite Number");
	            }
	        }
	       } 
        }
	   
	}
}