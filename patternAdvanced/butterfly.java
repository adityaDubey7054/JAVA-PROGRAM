public class butterfly {
    public static void butterflyPattern(int n){
        //outer loop 
        for(int i=1;i<=n;i++){
            //star print
            for(int j=1;j<=i;j++){
             System.out.print("*");
            }
            //space print
            for(int j=1;j<=2*(n-i);j++){
             System.out.print(" ");
            }
            //star print
            for(int j=1;j<=i;j++){
             System.out.print("*");
            }
             System.out.println();
        }
        
        for(int i=n;i>=1;i--){
            //star print
            for(int j=1;j<=i;j++){
            System.out.print("*");
            }
            //space print
            for(int j=1;j<=2*(n-i);j++){
             System.out.print(" ");
            }
            //star print
            for(int j=1;j<=i;j++){
             System.out.print("*");
            } 
             System.out.println();
        }
        
    }
	public static void main(String[] args) {
	    butterflyPattern(10);
	}
    
}
