package packageA;
import  org.apache.logging.log4j.*;

public class DemoA {
	
	private static Logger Log = LogManager.getLogger(DemoA.class.getName());
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.debug("Iam debugging");
		
		if(2<0) {
			Log.debug("I am inside if loop");
		}
		else {
			Log.debug("I am in Else loop");
		}
		Log.error("I am an error log");
		Log.fatal("This is fatal");
	}

}
