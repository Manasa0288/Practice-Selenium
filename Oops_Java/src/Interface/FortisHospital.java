package Interface;

public class FortisHospital implements Hospital {

	public static void main(String[] args) {
		

	}

	@Override
	public void operate() {
		System.out.println("Fortis operating");
		
	}

	@Override
	public void doscan() {
		System.out.println("Fortis scanning");
		
		
	}

	@Override
	public void dovaccination() {
		System.out.println("Fortis vaccination");
		
		
	}
	public void PhoneConsultation(){
		System.out.println("PhoneConsultation");
	}
	

}
