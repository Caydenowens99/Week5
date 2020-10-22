

public class AsteriskLogger implements Logger {

	
	public void Log(String Log) {
	System.out.println("***" + Log.toString() + "***");
	}

	@Override
	public void Error(String error) {
	System.out.println("********************");
	System.out.println("***" + "ERROR:" + error.toString() + "***");
	System.out.println("********************");
	}

	
	
}
