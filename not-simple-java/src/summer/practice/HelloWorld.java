package summer.practice;

import org.apache.log4j.Logger;

/**
 * Created by iuliana.cosmina on 6/29/17.
 */
public class HelloWorld {

	public static final Logger logger = Logger.getLogger(HelloWorld.class);

	public static void main(String[] args) {
		if (args.length > 0) {
			logger.info("Hello " + args[0] + "!");
		} else {
			logger.info("Hello World!");
		}
	}
}
