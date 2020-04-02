// THIS CODE DOES NOT WORK!!!

package APIHomework;

import org.testng.annotations.Test;

public class TestPojo {
	
	@Test
//	public void main (String[] args) {
	public void testPrint() {

		String apiData = new String("{\"page\":1,\"per_page\":6,\"total\":12,\"total_pages\":2,\"data\":[{\"id\":1,\"email\":\"george.bluth@reqres.in\",\"first_name\":\"George\",\"last_name\":\"Bluth\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/calebogden/128.jpg\"},{\"id\":2,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"Janet\",\"last_name\":\"Weaver\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg\"},{\"id\":3,\"email\":\"emma.wong@reqres.in\",\"first_name\":\"Emma\",\"last_name\":\"Wong\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/olegpogodaev/128.jpg\"},{\"id\":4,\"email\":\"eve.holt@reqres.in\",\"first_name\":\"Eve\",\"last_name\":\"Holt\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg\"},{\"id\":5,\"email\":\"charles.morris@reqres.in\",\"first_name\":\"Charles\",\"last_name\":\"Morris\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/stephenmoon/128.jpg\"},{\"id\":6,\"email\":\"tracey.ramos@reqres.in\",\"first_name\":\"Tracey\",\"last_name\":\"Ramos\",\"avatar\":\"https://s3.amazonaws.com/uifaces/faces/twitter/bigmancho/128.jpg\"}],\"ad\":{\"company\":\"StatusCode Weekly\",\"url\":\"http://statuscode.org/\",\"text\":\"A weekly newsletter focusing on software development, infrastructure, the server, performance, and the stack end of things.\"}}");

		PojoData[] output = new PojoData[10];

		deserializeApiData(apiData, output);
		/*
		for (int i = 0; i < 6; i++) {
			output[i].printOut();
		}
*/
	}

	char page;
//	char per_page;
	String per_page;
	char total;
	char total_pages;


	public void deserializeApiData(String inputString, PojoData[] out) {

		int idIndex = 0;
		
		boolean pageBoolean = false;
		boolean per_pageBoolean = false;
		boolean totalBoolean = false;
		boolean total_pagesBoolean = false;
		boolean idBoolean = false;
		boolean emailBoolean = false;
		boolean first_nameBoolean = false;
		boolean last_nameBoolean = false;
		boolean avatarBoolean = false;

		for (int i = 0; i < inputString.length(); i++) {
/*
			if (!pageBoolean & (inputString.charAt(i) == ':')) {
				page = inputString.charAt(i+1);
				pageBoolean = true;
				System.out.println("page = " + page);
			}*/
			//if (!per_pageBoolean && (inputString.charAt(i) == ':')) {
			if (!per_pageBoolean && (i < inputString.length()) && (inputString.substring(i, i+8)) == "per_page") {
				//per_page = inputString.charAt(i+1); // error here, just one character in, need two or more!
				per_page = inputString.substring(21, 22); // error here, just one character in, need two or more!
				per_pageBoolean = true;
				System.out.println("per_page = " + per_page);
			}
				/*
			if (!totalBoolean && (inputString.charAt(i) == ':')) {
				total = inputString.charAt(i+1); // error here, just one character in, need two or more!
				totalBoolean = true;
			}
			if (!total_pagesBoolean && (inputString.charAt(i) == ':')) {
				total_pages = inputString.charAt(i+1); // error here, just one character in, need two or more!
				total_pagesBoolean = true;
			}

			if (!idBoolean && (inputString.charAt(i) == ':')) {
				idIndex = inputString.charAt(i+1);// - 1; // id = 1, idIndex = 0
				out[idIndex].setId(idIndex + 1); // id = 1 on first pass, will update on subsequent passes
				idBoolean = true;
			}
			if (!emailBoolean && (inputString.charAt(i-1) == ':') && (inputString.charAt(i) == '"')) {
				String emaiL = new String("");
				for (int j = i+1; inputString.charAt(j) != '"'; j++) {
					emaiL += Character.toString(inputString.charAt(j));	
				}
				out[idIndex].setEmail(emaiL);
				emailBoolean = true;
			}
			if (!first_nameBoolean && (inputString.charAt(i-1) == ',') && (inputString.charAt(i) == '"')) {
				String firstName = new String("");
				for (int j = i+1; inputString.charAt(j) != '"'; j++) {
					firstName += Character.toString(inputString.charAt(j));	
				}
				out[idIndex].setFirst_name(firstName);
				first_nameBoolean = true;
			}
			if (!last_nameBoolean && (inputString.charAt(i-1) == ',') && (inputString.charAt(i) == '"')) {
				String lastName = new String("");
				for (int j = i+1; inputString.charAt(j) != '"'; j++) {
					lastName += Character.toString(inputString.charAt(j));
				}
				out[idIndex].setLast_name(lastName);
				first_nameBoolean = true;
			}
			if (!avatarBoolean && (inputString.charAt(i) == '/') && (inputString.charAt(i+1) == '/')) {
				String http = new String("https://");
				for (int j = i+2; inputString.charAt(j) != '"'; j++) {
					http += Character.toString(inputString.charAt(j));
				}
				out[idIndex].setAvatar(http);
				avatarBoolean = true;
			}
			*/
			//idBoolean = false;
			emailBoolean = false;/*
			first_nameBoolean = false;
			last_nameBoolean = false;
			avatarBoolean = false;
*/
		}

		return;
	}


}

