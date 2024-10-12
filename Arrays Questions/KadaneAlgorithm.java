public class KadaneAlgorithm {
    public static void KadaneAlgorithm(int number[]){
        int cs =0;
        int ms = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
          cs=cs+number[i];
        
          if(cs<0){
          cs=0;
          
          }
          ms=Math.max(ms,cs);
        }
         System.out.println("the maximum sum of sub array is = "+ms);
      }  
      public static void main(String[] args) {
      int number[]= {-2,-4,-1,-5,7,-1,4};
      KadaneAlgorithm(number);
      }
}
