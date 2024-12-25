package app.pizza.service;

import app.pizza.api.Pizza;
import app.pizza.api.request.CreatePizzaRequest;
import app.pizza.api.response.CommonCrudResponse;
import app.pizza.api.response.CommonSearchResponse;

public interface PizzaService {
  CommonCrudResponse<Pizza> createPizza(CreatePizzaRequest request);
  CommonSearchResponse<Pizza> searchPizzaHistory();
}
