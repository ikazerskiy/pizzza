package app.pizza.controller;

import app.pizza.api.Pizza;
import app.pizza.api.request.CreatePizzaRequest;
import app.pizza.api.response.CommonCrudResponse;
import app.pizza.api.response.CommonSearchResponse;
import app.pizza.service.PizzaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController("api/pizza")
public class PizzaController {

  private final PizzaService pizzaService;

  @PostMapping("/")
  public ResponseEntity<CommonCrudResponse<Pizza>> createPizza(@RequestBody CreatePizzaRequest request) {
    return ResponseEntity.ok(pizzaService.createPizza(request));
  }

  @PostMapping("api/pizza/history")
  public ResponseEntity<CommonSearchResponse<Pizza>> searchPizzaHistory() {
    return ResponseEntity.ok(pizzaService.searchPizzaHistory());
  }

}
