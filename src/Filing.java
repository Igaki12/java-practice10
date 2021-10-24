import java.io.*;
public class Filing {

	public void WriteList(String list) {
		try {
			FileWriter fw = new FileWriter("src/list.csv",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(list);
			pw.close();
			
		}catch (IOException e) {
			System.out.println("File_list.csv was not found.");
		}finally {
			
		}
	}
	public void ReadList() {
		BufferedReader br = null;
		
		try {
			File file = new File("src/list.csv");
			br = new BufferedReader(new FileReader(file));
			
			System.out.println("ID,name,tel");
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		}catch (IOException e) {
			System.out.println("File_list.csv was not found.");
		}
		
		
	}
}
