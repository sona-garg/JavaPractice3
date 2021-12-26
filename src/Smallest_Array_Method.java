
public class Smallest_Array_Method {
	
	public static void check_array(int  num[]){
		int size,temp;
		size=num.length;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(num[i]>num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}//end of if
				
			}//end of 2nd for loop
		}//end of 1st for loop
		//array in increasing order
		System.out.println("The elements of the array in increasing order:");
		for(int i=0;i<size;i++) {
			System.out.print("  "+num[i]+"   ");
		}
		System.out.println("     ");
		System.out.println("The elements of the array in decreasing order:");
		for(int i=size-1;i>=0;i--) {
			System.out.print("  "+num[i]+"   ");
		}
		
	}
	
	

	public static void main(String[] args) {
		int num[] = {10,12,1,2,8,11};
		System.out.println("The elements of the array are:");
		for(int i=0;i<num.length;i++) {
			System.out.print("  "+num[i]+" ");
		}
		System.out.println("   ");
		//System.out.println("The smallest number in the array is:");
		check_array(num);

	}

}
