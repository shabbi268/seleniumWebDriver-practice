package packageB;
import  org.apache.logging.log4j.*;

public class DemoB {
	
	private static Logger Log = LogManager.getLogger(DemoB.class.getName());
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Log.debug("DEMOB Iam debugging");
		
		if(2<0) {
			Log.debug("DEMOB I am inside if loop");
		}
		else {
			Log.debug("DEMOB I am in Else loop");
		}
		Log.error("DEMOB I am an error log");
		Log.fatal("DEMOB This is fatal");
	}

}
