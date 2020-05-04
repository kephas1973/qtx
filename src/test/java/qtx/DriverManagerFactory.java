package qtx;

public class DriverManagerFactory {
	
	public static DriverManager getManager(DriverTypes type) {
		
		switch(type) {
		case CHROME:
			return new ChromeDriverManager();
		case FIREFOX:
			return new FirefoxDriverManager();
		case EDGE:
			return new EdgeDriverManager();
		default:
			System.out.println(type + " is not a supportes driver!");
		}
		return null;
	}
}
