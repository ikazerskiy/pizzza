package app.pizza.api.request;

import app.pizza.api.Base;
import app.pizza.api.Item;
import java.util.List;
import java.util.UUID;

public record CreatePizzaRequest(UUID pizzeriaId, Base base, List<Item> items) {
}
