
public class Consumer extends Thread{
	private int id;
	private CubbyHole ch;
	
	public Consumer(int id, CubbyHole ch) {
		this.id = id;
		this.ch = ch;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			try {
				Lock.semCon.acquire();
				ch.get(id, i);
				sleep(250);
				Lock.semProd.release();
			} catch (InterruptedException e) {
			}
		}
	}
}