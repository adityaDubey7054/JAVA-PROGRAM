import java.util.*;

public class a {
   
    public static int ClearIthElement(int n ,int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
        
    }
    public static int SetIthElement(int n ,int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }
    public static int UpdateIthElement(int n , int i,int newBit){
        if(newBit==0){
            return ClearIthElement(n,i);
        
        }else{
            return SetIthElement(n,i);
        }
    }
    public static int ClearInRange(int n,int i,int j){
        int a = (~0)<<j+1;
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static boolean IsPowerOfTwo(int n){
       
        return (n &(n-1))==0;
    }
	public static void main(String[] args) {
// 		System.out.println(ClearIthElement(11,1));
// 		System.out.println(SetIthElement(11,2));
// 		System.out.println(UpdateIthElement(11,3,0));
        // System.out.println(ClearInRange(10,2,4));
        System.out.println(IsPowerOfTwo(10));
	}
}

