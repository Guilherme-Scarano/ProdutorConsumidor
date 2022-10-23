
public class Producer extends Thread{
	private int id;
	private CubbyHole ch;
	
	public Producer(int id, CubbyHole ch) {
		this.id = id;
		this.ch = ch;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			try {
				Lock.semProd.acquire();
				ch.set(id, i);
				sleep(250);
				Lock.semCon.release();
			} catch (InterruptedException e) {
			}
		}
	}
}