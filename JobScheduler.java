import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JobScheduler {
	LinkedPQ<PCB> list;
	String file;
	
	public JobScheduler(String file) {
		list = new LinkedPQ<PCB>();
		this.file = file;
	}
	
	public void readFile() throws IOException {
		File f = new File(this.file);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line;
		
		while((line=br.readLine()) != null) {
			String[] splitted = line.split(";");
			String idString = splitted[0].split(":")[1];
			String cpuTimeString = splitted[1].split(":")[1];
			String sizeString = splitted[2].split(":")[1];
			
			int id = Integer.parseInt(idString);
			int cpuTime = Integer.parseInt(cpuTimeString);
			int size = Integer.parseInt(sizeString);
			
			PCB result = new PCB(id, cpuTime, size);
			list.enqueue(result, result.getSize());
		}
	}
	
	public PCB serve() {
		return list.serve().getData();
	}
	
}
