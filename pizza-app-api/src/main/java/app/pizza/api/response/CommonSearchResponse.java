package app.pizza.api.response;

import app.pizza.api.Record;
import java.util.Collection;

public record CommonSearchResponse<T>(Collection<Record<T>> searchResult, Page page) {

}
