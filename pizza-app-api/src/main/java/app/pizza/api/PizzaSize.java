package app.pizza.api;

public enum PizzaSize {
  SMALL(18), MEDIUM(24), LARGE(32), FAMILY(48);

  private final int size;

  PizzaSize(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }
}
