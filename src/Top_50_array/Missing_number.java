package Top_50_array;

public class Missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,4,5,6,7};
		int n=arr.length;
		int esum=(n+1)*(n+2)/2;
		int sum=0;
		for(int i=0; i<n; i++) {
			sum=sum+arr[i];
		}
		
		System.out.println("missing no is:"+ (esum-sum));

	}

}
