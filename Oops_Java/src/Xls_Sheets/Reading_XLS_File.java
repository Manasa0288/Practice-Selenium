package Xls_Sheets;

public class Reading_XLS_File {

	public Reading_XLS_File(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Reading_XLS_File datatable=new Reading_XLS_File("E:\\Data.xlsx");
		int r=datatable.getRowCount("Record");
		System.out.println(r);
		

	}

	private int getRowCount(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
