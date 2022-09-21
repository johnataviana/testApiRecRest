package testCobertura;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.junit.BeforeClass;
import org.junit.Test;

import com.google.gson.Gson;

import br.com.dbc.dto.Root;
import io.restassured.RestAssured;



public class ConsultaUsuarioIDInvalido {
	
	public static String responseBody = "{\r\n"
			+ "    \"data\": {\r\n"
			+ "        \"id\": 2,\r\n"
			+ "        \"email\": \"janet.weaver@reqres.in\",\r\n"
			+ "        \"first_name\": \"Janet\",\r\n"
			+ "        \"last_name\": \"Weaver\",\r\n"
			+ "        \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\r\n"
			+ "    },\r\n"
			+ "    \"support\": {\r\n"
			+ "        \"url\": \"https://reqres.in/#support-heading\",\r\n"
			+ "        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\r\n"
			+ "    }\r\n"
			+ "}";
	
	@BeforeClass
	public static void setup() {
		RestAssured.baseURI = "https://reqres.in/api/";
	}
	
    @Test
    public void consultaPorIDValido() {
    	    Root root = new Root();
    	    root = new Gson().fromJson(responseBody, Root.class);
    	    String validGson = new Gson().toJson(root);
    	    String id = "2";
  		    given().when()
			         .get("users/"+id)
			         .then()
			       .statusCode(200)
			        .body(containsString(validGson))
			        .log().all();
	}
    
  
}	
