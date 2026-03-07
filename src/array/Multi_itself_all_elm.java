package array;

public class Multi_itself_all_elm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4};
		int [] ans= new int[arr.length];
		int pre=1;
		
		for(int i=1; i<arr.length; i++) {
			pre=pre*arr[i];
			ans[i]=pre;
					
		}
		for(int i: ans) {
			System.out.print(i+" ");
		}

	}

}
