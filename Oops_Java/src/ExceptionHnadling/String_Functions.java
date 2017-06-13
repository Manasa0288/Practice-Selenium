package ExceptionHnadling;

public class String_Functions {

	public static void main(String[] args) {
		String str="The Rains have started";
		String str1="The Rains have not started";
		System.out.println(str.length());
		System.out.println("fifth index"+str.charAt(5));
		System.out.println("First occurance of s-"+str.indexOf('s'));
		System.out.println("Second occurance of s-"+str.indexOf("s",9));
		System.out.println(str.indexOf("hello"));
		System.out.println(str.equals(str1));
		System.out.println(str.substring(8, 14));
		System.out.println("*********************");
		String temp []=str.split("have");
		for(int i=0;i<temp.length;i++)
			System.out.println(temp[i]);
		//Converting Data types >>> string to integer
		String x="100";
		int i=Integer.parseInt(x);
		
		// integer to string
		String z=String.valueOf(i);
		boolean b= Boolean.valueOf("true");
		
		
		
		
		
		
		

	}

}
