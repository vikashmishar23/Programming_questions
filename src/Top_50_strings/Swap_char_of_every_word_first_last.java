package Top_50_strings;

public class Swap_char_of_every_word_first_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "m#@&6n (y@#$z w3$^g7#   4rt^H&G*su";

        String[] str = s.split(" ");

        for (String word : str) {

            char[] arr = word.toCharArray();
            int i = 0;
            int j = arr.length - 1;

            while (i < j) {

                if (!Character.isLetter(arr[i])) {
                    i++;
                } 
                else if (!Character.isLetter(arr[j])) {
                    j--;
                } 
                else {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    i++;
                    j--;
                }
            }

            System.out.print(new String(arr) + " ");

	}

	}
}
