package Interface;

public class CallHospital {
	public static void main(String[] args) {
		// Hospital h=new hospital();///illegal we cant create object for interface
	
	FortisHospital F=new FortisHospital();
	F.doscan();
	F.operate();
	F.dovaccination();
	F.PhoneConsultation();
	
	System.out.println("---------------");
	
	GovtHospital G=new GovtHospital();
	G.doscan();
	G.operate();
	G.dovaccination();
	Hospital H=new FortisHospital();
			
		
			
	}

}
