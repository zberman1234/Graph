public class Vnode extends Node {
  private Object val;

  public Vnode(Object v) {
    super(v.hashCode()); // converts object into integer
    val = v;
  }

  public String toString() {
    return val.toString();
  }
}