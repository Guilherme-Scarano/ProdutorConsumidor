
public class CubbyHole {
	private int content  = -1;
	
	public int get(int consumer, int value) {
			System.err.printf("Cosumidor %d consumiu %d \n", consumer, content);
			return content;
	}
	
	public void set(int producer, int value) {
			content = value;
			System.out.printf("Produtor %d produziu %d \n", producer, content);
	}
}