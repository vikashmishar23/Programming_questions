package sorting_algo;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {6,1,3,4,2,7,5};
		for(int i=0; i<arr.length-1; i++) {
			int small=i;
		for(int j=i+1; j<arr.length; j++) {
			if(arr[small]>arr[j]) {
				small=j;
			}
		  }
		int temp=arr[small];
		arr[small]=arr[i];
		arr[i]= temp;
		}
		
		for(int elm: arr) {
			System.out.print(elm+" ");
		}
	}

}
