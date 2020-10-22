
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = new AsteriskLogger();
		logger.Log("Hello");
		System.out.println("");
		logger.Error("Hello");
		System.out.println("");
		
		Logger logger1 = new SpacedLogger();
		logger1.Log("Hello:");
		logger1.Error(" " + "Hello");
	}

}
