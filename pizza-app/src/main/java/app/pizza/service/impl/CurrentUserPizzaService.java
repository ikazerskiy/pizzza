package app.pizza.service.impl;

import app.pizza.api.Pizza;
import app.pizza.api.request.CreatePizzaRequest;
import app.pizza.api.response.CommonCrudResponse;
import app.pizza.api.response.CommonSearchResponse;
import app.pizza.service.PizzaService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CurrentUserPizzaService implements PizzaService {

  @Override
  public CommonCrudResponse<Pizza> createPizza(CreatePizzaRequest request) {
    return null;
  }

  @Override
  public CommonSearchResponse<Pizza> searchPizzaHistory() {
    return null;
  }
}
