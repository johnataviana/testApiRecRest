package testCobertura;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

import org.junit.BeforeClass;
import org.junit.Test;

import br.com.softdesign.geradores.GeradorCpf;
import io.restassured.RestAssured;



public class ConsultaUsuarioIDValido {
	
	@BeforeClass
	public static void setup() {
		RestAssured.baseURI = "https://reqres.in/api/";
	}
	
    @Test
    public void consultaPorIDValido() {
    	    String id = "50";
  		    given().when()
			         .get("users/"+id)
			         .then()
			       .statusCode(404)
			         .body(containsString(""))
			         .log().all();
	}
    
  
}	
