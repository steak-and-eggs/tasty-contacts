package app;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;


public class ModAdd extends Module {
  private Scanner contactScanner;

  public ModAdd(ArrayList<Contact> cl, File cf){
    super(cl, cf);
    contactScanner = new Scanner(System.in).useDelimiter("\n");
  }

  public void run(){
    System.out.println("\nEnter a name:");
    String newContactName = contactScanner.next();
    System.out.println("\nEnter a phone number:");
    String newContactNumber = contactScanner.next();
    System.out.println("\nName: " + newContactName +"\nNumber: " + newContactNumber);
    this.contactList.add(new Contact(newContactName, newContactNumber));
  }

}
