package Top_50_array;

public class Find_all_pair_given_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {3,2,4,5,4};
		int k=9;
		for(int i=1; i<=arr.length-1; i++) {
		//	for(int j=0; j<arr.length; j++)
			if(arr[i] +arr[i-1]==k) {
				System.out.println(arr[i]+ "+"+ arr[i-1]+"="+k);
				
			}
	//	}

	}

	}}
