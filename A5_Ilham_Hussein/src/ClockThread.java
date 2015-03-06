import java.util.Calendar;

public class ClockThread extends Thread {
	public ClockInterface clockInterface;

	public ClockThread(ClockInterface ci) {
		this.clockInterface = ci;
	}

	public void run() {
		System.out.println("ute");
		while (true) {
			System.out.println("test"); // test hur långt programet kan köra
										// innan error
			try {
				Calendar cal = Calendar.getInstance();

				int _hour = cal.get(Calendar.HOUR_OF_DAY);
				int _minute = cal.get(Calendar.MINUTE);
				int _second = cal.get(Calendar.SECOND);
				clockInterface.update(_hour, _minute, _second);

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	};
}