package array;

public class Multiply_all_elm_without_itself {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4};
		int pre=1,post=1;
		int [] ans=new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			ans[i]=pre;
			pre=pre*arr[i];
		}
		
		for(int i=arr.length-1; i>=0; i--) {
		    ans[i]*=post;
			post=post*arr[i];
		}
		
		for(int i: ans) {
			System.out.print(i+" ");
		}

	}

}
