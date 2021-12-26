
public class Largest_Array_Method {
	public static int check_array(int array[]) {
		int temp, size;
	      
	      size = array.length;

	      for(int i = 0; i<size; i++ ){
	         for(int j = i+1; j<size; j++){
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }//end of if
	         }//end of second for loop
	      }//end of first for loop
		
		return array[size-1];
	}

	public static void main(String[] args) {
		int array[] = {10, 20, 25, 63, 96, 57};
		System.out.println("The elements of the array are:");
		for (int i=0;i<array.length;i++) {
			System.out.print(" "+array[i]+" ");
			
		}
		System.out.println("   ");
	
		System.out.println("The largest number in the array is: "+check_array(array));
	      
	      //System.out.println("Third largest element is:: "+array[size-1]);
		}//end of main

}//end of class
