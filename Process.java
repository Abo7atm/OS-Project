
public class Process {
	
	private int id;
	private int cpuTime;
	private int size;
	private enum State { ready, running, waiting, terminated }
	private State state;
	
	
	public Process(int id, int cpuTime, int size) {
		this.id = id;
		this.cpuTime = cpuTime;
		this.size = size;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCpuTime() {
		return cpuTime;
	}

	public void setCpuTime(int cpuTime) {
		this.cpuTime = cpuTime;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
}
