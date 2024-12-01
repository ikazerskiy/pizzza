package app.pizza.api;

import java.util.List;

public record Pizza(Base base, List<Item> items) {
}
