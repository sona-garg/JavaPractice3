
public class Overload_Equal {
	public static boolean equal(int num1,int num2) {
		
		if(num1==num2)
			return true;
		else
			return false;
			
	}//end of integer check function

	public static boolean equal(String s1,String s2) {
		if(s1==s2)
			return true;
		else
			return false;
			
		
	}//end of string check function
	
	public static void main(String[] args) {
		System.out.println("Integer check:"+equal(2,3));
		System.out.println("Integer check:"+equal("nova","nova1"));
		
		

	}

}
