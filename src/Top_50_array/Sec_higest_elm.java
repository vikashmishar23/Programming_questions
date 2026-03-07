package Top_50_array;

public class Sec_higest_elm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {2,3,1,4};
		int fir=Integer.MIN_VALUE;
		int sec=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> fir) {
				sec=fir;
				fir=arr[i];
			}
		}
		System.out.println(sec);
     //   System.out.println(fir);
	}

}
