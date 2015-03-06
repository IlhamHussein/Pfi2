package se.mah.k3lara.skaneAPI.xmlparser;

import java.util.Calendar;

import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class SkaneThread extends Thread {

	private Parser Par;
	private GUI minGUI;
	public boolean running = true;

	public SkaneThread(Parser p, GUI g) {
		this.Par = p;
		this.minGUI = g;
	}

	public void run() {
		while(running){
			
		Lines lines = Parser.getStationResults(new Station ("80046"));
for(Line l: lines.getLines()){

		minGUI.Linje.append("        " +l.getLine() + "\n");
		minGUI.Destination.append("    " +  l.getTowrads()+"\n");
		int H = l.getDepTime().get(Calendar.HOUR_OF_DAY);
		int M = l.getDepTime().get(Calendar.MINUTE);
		minGUI.Avgår.append(String.format("%02d", H) +":" + String.format("%02d", M) + "\n");
		minGUI.Försening.append(l.getDepTimeDeviation() + " min försenad" + "\n");

	
			}
try{
	Thread.sleep(1000);
			} catch (InterruptedException ex) {
			
			}
	}

}


}