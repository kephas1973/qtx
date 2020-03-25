package courseProject;

public class DriverManagerFactory {
	
	public static DriverManager getManager(DriverTypes type) {
		
		switch(type) {
		case CHROME:
			return new ChromeDriverManager();
			default:
				System.out.println(type + " is not a supportes driver!");
		}
		return null;
	}
}
