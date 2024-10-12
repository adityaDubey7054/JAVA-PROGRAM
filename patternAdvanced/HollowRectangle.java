public class HollowRectangle {
    public static void Hollow_rectangle(int rows,int colmn){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=colmn;j++){
                if(i==1||i==rows||j==1||j==colmn){
                    System.out.print("*");
                }else{
                     System.out.print(" ");
                }
            }
             System.out.println();
        }
    }    
	public static void main(String[] args) {
		Hollow_rectangle(6,8);
	}
}
