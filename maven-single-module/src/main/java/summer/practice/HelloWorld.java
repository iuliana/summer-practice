package summer.practice;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import java.io.File;

/**
 * Created by iuliana.cosmina on 6/29/17.
 */
public class HelloWorld {

	public static final Logger logger = Logger.getLogger(HelloWorld.class);

	public static void main(String... args) {
		String log4jConfigFile = System.getProperty("log4j.configuration");
		if(log4jConfigFile != null) {
			DOMConfigurator.configure(log4jConfigFile);
		}
		if (args.length > 0) {
			logger.info("Hello " + args[0] + "!");
		} else {
			logger.info("Hello World!");
		}
	}
}
