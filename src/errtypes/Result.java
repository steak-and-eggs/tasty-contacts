package errtypes;

public class Result<T,E> {

  private T ok;
  private E err;

  public Result(){
    this.ok = null;
    this.err = null;
  }

  private Result(T ok, E err){
    this.ok = ok;
    this.err = err;
  }

  public Result<T,E> Ok(T ok){
    return new Result<T,E>(ok, null);
  }

  public Result<T,E> Err(E err){
    return new Result<T,E>(null, err);
  }

  public boolean isOk(){
    return this.ok != null && this.err == null;
  }

  public boolean isErr(){
    return this.err != null && this.ok == null;
  }

  public T unwrap() throws UnwrapException {
    if(!this.isOk()){
      throw new RuntimeException("Unwrap Failed.");
    }
    return this.ok;
  }

  public E unwrapErr() throws UnwrapException {
    if(!this.isErr()){
      throw new RuntimeException("Unwrap Failed.");
    }
    return this.err;
  }

}
