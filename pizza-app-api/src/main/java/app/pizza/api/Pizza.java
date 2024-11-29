package app.pizza.api;

import java.util.List;
import java.util.UUID;

public record Pizza(UUID pizzaId, Base base, List<Item> items) {
}
