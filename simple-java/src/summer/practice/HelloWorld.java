package summer.practice;

/**
 * Created by iuliana.cosmina on 6/29/17.
 */
public class HelloWorld {

	public static void main(String... args) {
		if (args.length > 0) {
			System.out.println("Hello " + args[0] + "!");
		} else {
			System.out.println("Hello World!");
		}
	}
}
