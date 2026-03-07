package array;

public class Maximum_no_occurance_elm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,5,2,3,2,3,9};
		int max=0;
		int val=0;
		
		int [] count= new int [256];
		for(int i=0; i<arr.length; i++) {
			count[arr[i]]++;
		}
		
		for(int j=0; j<arr.length; j++) {
			if(max<count[arr[j]]) {
			max=count[arr[j]];
			val=arr[j];
		}
		}
		System.out.println(val);

	}

}
