public class SubarraySum{
    public static void SubArraySum(int number[]){
        int Max_value=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                int currentSum=0;
                for(int k=start;k<=end;k++){
                    currentSum=currentSum+number[i];
                    
                }
                System.out.println(currentSum);
                if(Max_value<currentSum){
                    Max_value=currentSum;
                }
            }
           
        }
        System.out.println("the maximum value is "+Max_value); 
    }
	public static void main(String[] args) {
	int number[]={2,4,5,6,7,8,9};
	SubArraySum(number);
	}
}