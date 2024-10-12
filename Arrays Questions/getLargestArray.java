public class getLargestArray {
    public static int getlargestArray(int number[]){
        int largest = Integer.MIN_VALUE;
          for(int i=0;i<number.length;i++){
              if(largest<number[i]){
                  largest=number[i];
              }
              
          }
          return largest;
    }
    
	public static void main(String[] args) {
	    int number[]= {2,5,10,4,3,6};
	    System.out.println("largest value is "+getlargestArray(number));
	    
	}
    
}
