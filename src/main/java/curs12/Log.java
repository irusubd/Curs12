package curs12;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {
	
	public static Logger Log = LogManager.getLogger(Log.class);
	
	public static void info(String message) {
		Log.info(message);
	}
	
	public static void error(String string) {
		Log.error(string);
	}
	
	public static void debug(String message) {
		Log.debug(message);
	}

}
