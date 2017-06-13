package ExceptionHnadling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Creating_Reading_Writing_Text_Files {

	public static void main(String[] args) throws IOException {
		//Creating
		File f=new File("C:\\Users\\manu2\\Documents\\Creating file.txt");
		f.createNewFile();
		//Writing
		FileWriter w=new FileWriter("C:\\Users\\manu2\\Documents\\Creating file.txt");
		BufferedWriter Out=new BufferedWriter(w);
		Out.write("This is a new line");
		Out.newLine();
		Out.write("Hello");
		Out.flush();
		//Reading
		
		FileReader R=new FileReader("C:\\Users\\manu2\\Documents\\Creating file.txt");
		BufferedReader bfr=new BufferedReader(R);
		String x="";
		while((x=bfr.readLine())!=null){
			System.out.println(x);
		}
		
		
		
		
		

	}

}
