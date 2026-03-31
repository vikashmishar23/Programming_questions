package basic_question;

public class Fabbonaci {
	public static int fabb(int n) {
		if(n<=1) {
			return n;
		}
		
		return fabb(n-2)+ fabb(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		for(int i=0; i<n; i++) {
			System.out.print(fabb(i)+" ");
		}

	}

}
