package Inheritance;

public class CallMobile {

	public static void main(String[] args) {
		MobilePhone M=new MobilePhone();
		Phone P=new Phone();
		P.call();
		P.voicemail();
		
		System.out.println("-------------");
		M.call();
		M.voicemail();
		M.roamfree();

	}

}
