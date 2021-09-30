package jpuredata;

import org.puredata.core.PdBase;

public class Test {

	public static void main(String [] args) {
		int x=PdBase.startAudio();
		System.out.println("Started: "+x);
	}
}
