public class LinearSearch {
    public static int LinearSearch(int number[],int key){
          for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
          }
          return -1;
    }
    public static void main(String[] args) {
        int number[] = {4,6,9,3,2,5,11};
        int key = 5;
        int index = LinearSearch(number, key);
        if(index==-1){
            System.err.println("Not Found");
        }else{
            System.err.println("key is at index "+index);
        }
    }
}
