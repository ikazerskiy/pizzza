package app.pizza.controller;

import app.pizza.api.Pizza;
import app.pizza.api.request.CreatePizzaRequest;
import app.pizza.api.response.CommonResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("api/pizza")
public class PizzaController {

  @PostMapping("/")
  public ResponseEntity<CommonResponse<Pizza>> createPizza(@RequestBody CreatePizzaRequest request) {
    return ResponseEntity.ok(null);
  }

}
