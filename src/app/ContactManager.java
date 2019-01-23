package app;

public class ContactManager {

  private static void printWelcome(){
    String msg = "";
    for(int i = 0; i < 64; i++){
      msg += "=";
    }
    msg += "\n";
    for(int i = 0; i < 20; i++){
      msg += "=";
    }
    msg += " Contact Manager v0.0.1 ";
    for(int i = 0; i < 20; i++){
      msg += "=";
    }
    msg += "\n";
    for(int i = 0; i < 64; i++){
      msg += "=";
    }
    msg += "\n";
    System.out.print(msg);
  }

  public static void main(String[] args){

    printWelcome();

    Switch<String,Runnable> options = new Switch<>();
    Config config = new Config();
  }

}
