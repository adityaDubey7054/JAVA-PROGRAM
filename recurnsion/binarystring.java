public  public static void BinaryString(int n ,int lastplace,String str){
    if(n==1||n==2){
        return 2;
    }
    BinaryString(n,0,str+"0");
    if(lastplace==0){
         BinaryString(n,1,str+"1");
    }
}
public static void main(String[] args) {
    System.out.println(BinaryString(3,0,""));
}
} {
    
}
