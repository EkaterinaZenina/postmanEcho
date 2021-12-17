import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.*;

class PostmanEchoTest {
    @Test
      public void returnData() {
          given()
                .baseUri("https://postman-echo.com")
                .body("data") // отправляемые данные (заголовки и query можно выставлять аналогично)

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                  .body("data", IsEqual.equalTo("the 31st of December"))
        ;
    }
}