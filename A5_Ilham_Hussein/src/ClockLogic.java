
public class ClockLogic implements ClockInterface {
	private DigitalClockGUI clockGUI;
	private int alarmMinute;
	private int alarmHour;
	
	public ClockLogic(DigitalClockGUI clockIn) {
		this.clockGUI = clockIn;
		Thread t= new ClockThread(this); // skapa
		t.start(); // starta

	}

	public void setAlarm(int hours, int minutes) {
		this.alarmHour = hours;
		this.alarmMinute = minutes;
	}

	public void clearAlarm() {
		this.alarmHour = 25; 
		this.alarmMinute = 61;
	
	}

	public void update(int hours, int minutes, int seconds) {
		System.out.println("update");
String tim= "";
String min = "";
String sec = "";

		
if( hours < 10){
	tim = "0" + tim;
}

if( minutes < 10){
	min = "0" + min;
}

if( seconds < 10){
	sec = "0" + sec;
}

String H = tim + Integer.toString(hours);
String M = min + Integer.toString(minutes);
String S = sec + Integer.toString(seconds);

String tid = H + ":" + M + ":" + S;

clockGUI.setTimeOnLabel(tid);
System.out.println("update");
		 if(alarmHour == hours && alarmMinute == minutes){
			clockGUI.alarm(true);
		
		 }}
	
}