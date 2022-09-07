package practice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4J_Practice {
	
	
	private static final Logger logger = LogManager.getLogger(Log4J_Practice.class);
	public static void main(String[] args) {
		
		logger.info("Message");
		
		System.out.println("Hi");
	}

}
