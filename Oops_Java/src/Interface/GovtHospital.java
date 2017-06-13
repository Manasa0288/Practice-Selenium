package Interface;

public class GovtHospital implements Hospital {
	@Override
	public void operate() {
		System.out.println("Govt operating");
		
	}

	@Override
	public void doscan() {
		System.out.println("Govt scanning");
		
		
	}

	@Override
	public void dovaccination() {
		System.out.println("Govt vaccination");
	}

}
