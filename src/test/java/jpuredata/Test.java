package jpuredata;

import org.puredata.core.PdBase;

public class Test {

	public static void main(String [] args) {
		System.out.println("Loading start");
		//System.out.println(PdBase.isRunning());
		int x=PdBase.startAudio();
		System.out.println("Started PD");
	}
}
