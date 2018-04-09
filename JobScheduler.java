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
	
	public void readFile() throws FileNotFoundException {
		File f = new File(this.file);
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		
	}
	
}
