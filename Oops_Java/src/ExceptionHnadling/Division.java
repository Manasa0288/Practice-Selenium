package ExceptionHnadling;

public class Division {
	public static void main(String args[]){
		try{
			
		System.out.println("A");
		int i=2/0;
		System.out.println("B");
		System.out.println(i);
		
		}
		catch(Exception e)
		{
			System.out.println("ERROR");
			//System.out.println("ERROR"+e.getMessage());
			
		}
		System.out.println("C");
	}
	public static void divide(){
		
	}

}
