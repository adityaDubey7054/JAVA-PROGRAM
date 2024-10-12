public class trapwater {
    public static int Trap(int height[]){
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1;i<height.length;i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        int trappedwater = 0;
        for(int i=0;i<height.length;i++){
            int waterlabel = Math.min(leftmax[i],rightmax[i]);
            trappedwater += (waterlabel-height[i]);
        }
        System.out.println("total amount of water trap is :"+trappedwater);
        return trappedwater;
    }
    public static void main(String[] args) {
	    // Scanner sc = new Scanner(System.in);
	    // int size = sc.nextInt();
	    // int height[] = new int[size];
        int height[] = {4,2,0,6,3,2,5};
	    Trap(height);
	}
}
