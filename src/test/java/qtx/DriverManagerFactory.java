package qtx;

public class DriverManagerFactory {
	
	public static DriverManager getManager(DriverType type) {
		
		switch(type) {
		case CHROME:
			return new ChromeDriverManager();
			default:
				System.out.println(type + " is not a supportes driver!");
		}
		return null;
	}
}
