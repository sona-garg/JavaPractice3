
public class Reverse_Array {

	public static void main(String[] args) {
		int num[] = {1,20,3,4,5};
		int size = num.length;
		int temp;
		System.out.println("the array is: ");
		for(int i=0;i<size;i++) {
			System.out.print("  "+num[i]+"   ");
		}
		System.out.println("      ");
		System.out.println("The reverse of the array is:");
		for(int i=size-1;i>=0;i--) {
			System.out.print("  "+num[i]+"  ");
		}
		
	
	

	}

}
