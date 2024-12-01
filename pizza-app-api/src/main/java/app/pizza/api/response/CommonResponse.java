package app.pizza.api.response;

import app.pizza.api.Record;
import java.util.List;

public record CommonResponse<T>(Record<T> record, List<Error> errors) {

}
