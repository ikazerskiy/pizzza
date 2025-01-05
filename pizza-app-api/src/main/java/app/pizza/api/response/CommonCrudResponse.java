package app.pizza.api.response;

import app.pizza.api.Record;
import java.util.ArrayList;
import java.util.List;

public record CommonCrudResponse<T>(Record<T> record, List<Error> errors) {
  public CommonCrudResponse(Record<T> record) {
    this(record, new ArrayList<>());
  }
  public CommonCrudResponse(List<Error> errors) {
    this(null, errors);
  }
}
