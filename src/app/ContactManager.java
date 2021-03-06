package app;

import java.util.ArrayList;
import java.util.Scanner;
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

  public static void contactsOptions(){
    System.out.print(
      "\nPlease select from the options below:\n" +
      "1 - View all contacts\n" +
      "2 - Add new contact\n" +
      "3 - Search contacts\n" +
      "4 - Delete contact\n" +
      "5 - Exit\n");
  }

  public static void main(String[] args){
    // display the welcome banner
    printWelcome();
    // configure the program
    Config config = new Config();
    // Instantiate the list of contacts and read it in.
    // To read into the list, we'll use the contact reader class.
    ArrayList<Contact> contactList = new ArrayList<>();
    ContactReader conread = new ContactReader();
    conread.readInto(config.getContacts(), contactList);

    // construct all the modules
    Runnable view = new ModView(contactList, config.getContacts());
    Runnable add = new ModAdd(contactList, config.getContacts());
    Runnable search = new ModSearch(contactList, config.getContacts());
    Runnable delete = new ModDelete(contactList, config.getContacts());
    Runnable exit = new ModExit(contactList, config.getContacts());

    // Add the modules to the options
    // Many keys match to one option
    Switch<String,Runnable> options = new Switch<>();
    // The short case
    options.addCase("1", view);
    options.addCase("2", add);
    options.addCase("3", search);
    options.addCase("4", delete);
    options.addCase("5", exit);
    // The long case
    options.addCase("view", view);
    options.addCase("add", add);
    options.addCase("search", search);
    options.addCase("delete", delete);
    options.addCase("exit", exit);
    // the default case
    options.addDefault(new Runnable(){
      public void run(){
        System.out.println("\nERROR: Option not specified.\n");
      }
    });

    // Read the user input based with the newline as a delimiter
    Scanner scan = new Scanner(System.in).useDelimiter("\n");
    String userin = null;
    // This while loop is the meat and potatoes of the program. Each option is
    // runnable, so the match returns and runnable, which we run. The behavior
    // doesn't have to be specified, the object only needs to run.
    while(true){
      contactsOptions();
      userin = scan.next();
      options.match(userin).run();
    }

  }
}
