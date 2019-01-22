package errtypes;

public class Assert {

  private int passes;
  private int fails;
  private boolean exit_on_fail;
  private boolean dump_on_fail;
  private String failed_on;

  public Assert(){
    this.passes = 0;
    this.fails = 0;
    this.exit_on_fail = true;
    this.dump_on_fail = true;
  }

  public Assert(boolean exit, boolean dump){
    this.passes = 0;
    this.fails = 0;
    this.exit_on_fail = exit;
    this.dump_on_fail = dump;
  }

  public String toString(){
    return "{"+
      "\n\tfailed_on: " + failed_on +
      "\n\tpasses: " + passes +
      "\n\tfails: " + fails +
      "\n}";
  }

  public void dump(){
    System.out.println(this.toString());
  }

  private void fail(final String msg) {
    this.fails++;

    if(this.dump_on_fail){
      this.dump();
    }
    if(this.exit_on_fail){
      throw new RuntimeException(msg);
    }
  }

  public void eq(final Comparable a, final Comparable b){
    this.failed_on = "Assert.eq(...)";

    if(!a.equals(b)){
      this.fail("Assert.eq(...) failed.");
    }else{
      this.passes++;
    }
  }
}
