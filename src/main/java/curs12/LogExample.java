package curs12;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LogExample {
	
	final static Logger logger = LogManager.getLogger(LogExample.class);
	
	public static void main(String[] args) {
		LogExample obj = new LogExample();
		obj.printLog();
	}

	public void printLog() {

		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
		System.out.println("sysout");
	}

}
