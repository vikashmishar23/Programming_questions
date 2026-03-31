package Striver;

public class Rotate_array_by_d_place {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,6,7};
		int d=2;
		int n=arr.length;
		int [] temp= new int [2];
		
        for(int i=d; i<n-1; i++) {
        	arr[i-d]= arr[i];
        }
        for(int i=n-d; i<n; i++) {
        	//arr[i]= temp[]
        }
	}

}
