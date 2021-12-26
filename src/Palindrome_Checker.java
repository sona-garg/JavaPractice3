import java.util.Scanner;
public class Palindrome_Checker {
	public static boolean Palindrome(String word) {
		StringBuilder str = new StringBuilder(word);
	    str.reverse();
		String rev = str.toString();
		if(word.equals(rev)) {
			
			return true;
		}//end of if
		else {
			return false;
		}//end of else
		
	}//end of method 

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		for(int i=1;i<5;i++) {
			System.out.println("You have 4 attempts to try:");
			System.out.println("Attempt No."+i);
			System.out.println("Enter the word you want to check:");
			String attempt = input.next();
		boolean b=Palindrome(attempt);
		if (b==true) {
			System.out.println("The word you have entered is a Palindrome!");
		}
		else
			System.out.println("The word you have entered is not a Palindrome!");
		System.out.println("-------------------");
		}//end of for
      System.out.println("Done with Maximium attempts!");
      input.close();
     
	}//end of main


}//end of class
