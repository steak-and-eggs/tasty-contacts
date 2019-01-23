package app;

import java.util.ArrayList;
import java.io.File;

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
    Config config = new Config();

    ArrayList<String> contactList = new ArrayList<>();

    Runnable view = new ModView(contactList, config.getContacts());
    Runnable add = new ModAdd(contactList, config.getContacts());
    Runnable search = new ModSearch(contactList, config.getContacts());
    Runnable delete = new ModDelete(contactList, config.getContacts());
    Runnable exit = new ModExit(contactList, config.getContacts());
    Switch<String,Runnable> options = new Switch<>();
  }

}
