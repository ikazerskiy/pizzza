package app.pizza.api;

import java.time.ZonedDateTime;
import java.util.UUID;

public record Record<T>(UUID id, T dto, ZonedDateTime createDatetime, ZonedDateTime editingDatetime) {

}
