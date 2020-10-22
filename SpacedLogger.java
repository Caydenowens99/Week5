
public class SpacedLogger implements Logger {

	@Override
	public void Log(String Log) {
	System.out.println(Log.replace("",  " ").trim());
		//Log.replaceAll(".(?=.)", "$0");
	}

	@Override
	public void Error(String Error) {
	System.out.println("ERROR:" + Error.replace("",  " ").trim());

		
	}

}
