import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;



public class WriteToFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int id=0, cpu, size=0, totalSize=0;
		
		File f = new File("output.txt");
		
		f.createNewFile();
		
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		while(totalSize <= 500000) {
			size = ThreadLocalRandom.current().nextInt(16, 16384 + 1);
			totalSize+=size;
			cpu = ThreadLocalRandom.current().nextInt(16, 512 + 1);
			String result = ("ID:"+id++ +";CPU:"+cpu+";SZ:"+size);
			bw.write(result+"\n");

		}
		bw.close();
		
	}

}
