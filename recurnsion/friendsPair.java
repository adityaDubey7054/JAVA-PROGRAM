public class friendsPair {
    public static int FriendPair(int n){
        if(n==1||n==2){
            return n;
        }
        return FriendPair(n-1)+(n-1)*FriendPair(n-2);
    }
	public static void main(String[] args) {
		System.out.println(FriendPair(3));
	}
}
