package sorting_algo;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {6,1,3,4,2,7,5};
		for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
            	
            	if(arr[j]>arr[j+1]) {
            		int temp=arr[j];
            		arr[j]=arr[j+1];
            		arr[j+1]= temp;
            	}
            }
		}
		//  printing array element after sorting
		for(int elm :arr) {
			System.out.print(elm+" ");
		}
	}

}
