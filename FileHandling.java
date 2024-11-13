package hello_java;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class FileHandling2 {

	public static void main(String[] args) {
		try {
			FileWriter fw=new FileWriter("Somefile.txt",true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.write("Hey hai I'm Muhammadu Haarish,\r\n"
					+ "I'am recent Engineer graduvate currently looking job");
			bw.newLine();
			bw.append("I hope i can get job in IT");
			System.out.println("successfully added");
			bw.close();
		}
		catch(Exception e) {
			System.out.println("Somthing wrong ");}
		
		try {
			FileReader fr=new FileReader("Somefile.txt");
			BufferedReader br=new BufferedReader(fr);
			String file =br.readLine();
			while(file!=null) {
				System.out.println(file);
				file=br.readLine();
			}
			br.close();
		}
		catch(Exception e) {
			System.out.println("Somthing wrong ");
		}
	}

}
