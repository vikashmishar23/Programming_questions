package Top_50_array;

public class Find_elm_with_maximum_occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,3,4,5,3,5,7,8,3,9};
		int [] count= new int [256];
		int max=0;
		int val=0;
		int n=arr.length;
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		for(int i=0; i<n; i++) {
			if(max<count[arr[i]]) {
				max=arr[i];
				val=arr[i];
			}
		}
     System.out.println(val);
	}

}
