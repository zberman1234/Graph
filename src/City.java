public class City {
  private String moniker;
  private int last; // score in their last football game

  public City(String mon, int lastsc) {
    moniker = mon;
    last = lastsc;
  }

  public String toString() {
    return moniker + " last scored " + last + " points";
  }
}