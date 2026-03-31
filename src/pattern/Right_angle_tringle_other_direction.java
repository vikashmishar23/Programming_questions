package pattern;

public class Right_angle_tringle_other_direction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=4; i>=0; i--) {
		   for(int j=0; j<i; j++) {	
			   System.out.print(" ");
		   }
		   for(int j=i; j<=4; j++) {
			   System.out.print("*");
		   }
		   System.out.println();
		}

	}

}
