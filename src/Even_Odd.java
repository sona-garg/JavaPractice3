import java.util.Scanner;
public class Even_Odd {
	public static void check_num(int n) {
		if(n%2==0) {
			System.out.println("The number you have enetered is even.");
		}//end of if
		else {
			System.out.println("The number you have entered is odd.");
		}//end of else
		
	}//end of even/odd method

	public static void main(String[] args) {
		int x;
		Scanner input= new Scanner(System.in);
		for(int i = 1;i<5;i++)
		{
			System.out.println("You have 4 attempts:");
			System.out.println("Attempt No."+i);
			System.out.println("Enter the number you want to check:");
			int num = input.nextInt();
			check_num(num);
			System.out.println("--------------------");
		}//end of for loop to get the user input
		
		System.out.println("Maximum attempts done! Start the Game again if you want to try more!");
		input.close();
		
	}//end of main
	

}//end of class
