package Striver;

public class Majourity_elm_n2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,4,3,2,2,2,3,2};
		int n=arr.length;

		for(int i=0; i<n; i++) {
		    int count=0;

		    for(int j=0; j<n; j++) {
		        if(arr[j]==arr[i]) {
		            count++;
		        }
		    }

		    if(count>n/3) {
		        System.out.println(arr[i]);
		        break;
		    }
		}
	}

}
