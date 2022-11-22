package APITesting;

import com.jayway.restassured.response.Response;
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

public class WeatherGetRequest {


    //Simple get request for getting Weather request by City name
    @Test
    public void Test_01(){

        Response response = when().
                               get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=673c5650a20311041c26d61291b186ae");
        System.out.println(response.getStatusCode());


    }




    
}
