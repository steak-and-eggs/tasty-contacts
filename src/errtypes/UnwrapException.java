package errtypes;

public class UnwrapException extends Exception {

  public UnwrapException(){
    super("Unwrap failed.");
  }

  public String getDetails(){
    StackTraceElement[] details = this.getStackTrace();

    String msg = "Failed on...\n";
    for(StackTraceElement elem : details){
      msg += "UnwrapException: {" +
        "\n\tFile: " + elem.getFileName() +
        "\n\tLine: " + elem.getLineNumber() +
        "\n\tClass: " + elem.getClassName() +
        "\n\tMethod: {" +
        "\n\t\tname:" + elem.getMethodName() +
        "\n\t\tis_native_method :" + elem.isNativeMethod() +
        "\n\t}\n}\n";
    }
    return msg;
  }

}
