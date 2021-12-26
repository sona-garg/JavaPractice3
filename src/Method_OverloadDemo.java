public class Method_OverloadDemo {
	
	
	// Method to add two integers 
	public static int add(int n1,int n2){
		int sum=n1+n2;
		return sum;
	
	}
	// Method to add two integers
	public static int add(int n1,int n2,int n3){
		int sum=n1+n2+n3;
		return sum;
	
	}
	

	public static void main(String[] args) {
		int num1=1,num2=7,num3=8;
		int s=add(num1,num2);      //Calls the method add with 2 parameters
		System.out.println(num1+" + "+num2+" = "+s);

		int s1=add(num1,num2,num3);//Calls the method add with 3 parameters

		System.out.println(num1+" + "+num2+" + "+num3+" = "+s1);

     }

}