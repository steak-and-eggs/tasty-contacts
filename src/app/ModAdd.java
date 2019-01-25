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
    String name = contactScanner.next();

    System.out.println("\nEnter a phone number:");
    String number = contactScanner.next();

    System.out.println("\nDEBUG:" +
      "\n\tName: " + name +
      "\n\tNumber: " + sanitizeNumber(number) +
      "\n"
    );

    try {
      this.contactList.add(new Contact(name, sanitizeNumber(number)));
    } catch(NumberFormatException e){
      System.out.println("Error: invalid number: " +
        sanitizeNumber(number) +
        "\nPlease enter a phone number with 10 digits."
      );
    }
  }

  private String sanitizeNumber(String number){
    String clean = "";
    for(char ch : number.toCharArray()){
      if(ch >= '0' && ch <= '9'){
        clean += ch;
      }
    }
    return clean;
  }

}
