package Top_50_array;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,1,4};
		int max=0;
		for(int i=0; i<arr.length; i++) {
    if(arr[i]>max) {
    	max=arr[i];
    }

	}
		System.out.println(max);

	}

}
