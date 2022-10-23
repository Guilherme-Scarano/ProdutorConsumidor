import java.util.concurrent.Semaphore;

public class Lock {
	// Semáforo Mutex
	public final static Semaphore semCon = new Semaphore(0); 
	public final static Semaphore semProd = new Semaphore(1);
}
