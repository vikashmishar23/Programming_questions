package Top_50_array;

public class Find_first_repeating_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,3,5,7,8,9};
		int [] count= new int [256];
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		int n=arr.length;
		for(int i=0; i<n; i++) {
			if(count[arr[i]]!=1) {
				System.out.println(arr[i]);
				return;
			}
		}

	}

}
