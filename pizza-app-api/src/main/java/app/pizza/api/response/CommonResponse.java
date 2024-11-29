package app.pizza.api.response;

import java.util.List;

public record CommonResponse<T>(T model, List<Error> errors) {

}
