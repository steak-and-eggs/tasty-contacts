package app;

import java.util.HashMap;
/*
  Switch.java

  The switch class behaves like a switch statement for objects. It matches cases
  to runnable objects. Like a switch statement, it should default to behavior.
  If that default behavior is not specified, a null is returned.
*/
public class Switch<T,U> {

  private HashMap<T,U> self;
  private U def;

  public Switch(){
    self = new HashMap<>();
    def = null;
  }

  public void addCase(T key, U behavior){
    self.put(key, behavior);
  }

  public void addDefault(U behavior){
    def = behavior;
  }

  public U match(T key){
    if(self.containsKey(key)){
      return self.get(key);
    }
    else {
      return def;
    }
  }

}
