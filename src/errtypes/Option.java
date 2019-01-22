package errtypes;

public class Option<T> {

  //public static final int UNWRAP_FAILED = -1;

  private T some;
  private boolean none;

  public Option(){
    this.some = null;
    this.none = false;
  }

  private Option(T some, boolean none){
    this.some = some;
    this.none = none;
  }

  public Option<T> Some(T some){
    return new Option<T>(some, false);
  }

  public Option<T> None(){
    return new Option<T>(null, true);
  }

  public boolean hasSome(){
    return (this.some != null && this.none == false);
  }

  public boolean hasNone(){
    return (this.some == null && this.none == true);
  }

  public T unwrap() throws UnwrapException {
    if(this.hasNone()){
      throw new UnwrapException();
    }
    return some;
  }

}
