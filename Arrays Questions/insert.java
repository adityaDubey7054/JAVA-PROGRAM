

public class insert {
   
    public static void arraysOperation(int marks[]){
        for(int i=0;i<marks.length;i++){
             marks[i]=marks[i]+1;
        }
    }
	public static void main(String[] args) {
// 		System.out.println("Hello World");
        int marks[] = {32,33,34};
        arraysOperation(marks);
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
	}
}

