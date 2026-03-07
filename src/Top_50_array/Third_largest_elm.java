package Top_50_array;

public class Third_largest_elm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,1,4};
		int lar=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		int third=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>lar) {
				third=sec;
				sec=lar;
				lar=arr[i];
				
			}
			else if(arr[i]>sec && arr[i]!=lar) {
				third=sec;
				sec=arr[i];
			}
			else if(arr[i]>third && arr[i]!=sec && arr[i]!=lar) {
				third=lar;
			}
		}
  System.out.println(third);
	}

}
