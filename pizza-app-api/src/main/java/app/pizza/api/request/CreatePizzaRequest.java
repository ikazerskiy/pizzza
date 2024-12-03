package app.pizza.api.request;

import app.pizza.api.Base;
import app.pizza.api.Item;
import app.pizza.api.Record;
import java.util.List;

public record CreatePizzaRequest(Base base, List<Record<Item>> items) {
}
