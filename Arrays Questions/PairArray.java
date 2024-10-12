public class PairArray {
    public static void PairArray(int number[]){
        for(int i=0;i<number.length;i++){//2,3,4,5,6,7,8;
             int current = number[i];
             for(int j=i+1;j<number.length;j++){
                 System.out.print("("+current+","+number[j]+")");
             }
             System.out.println();
        }
    }
	public static void main(String[] args) {
	    int number[]={2,3,4,5,6,7,8};
	    PairArray(number);
	}
}
