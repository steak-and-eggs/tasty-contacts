package app;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class ModDelete extends Module {
  private Scanner deleteScanner;
  public ModDelete(ArrayList<Contact> cl, File cf){
    super(cl, cf);
    deleteScanner = new Scanner(System.in).useDelimiter("\n");
  }

  public void run(){
    System.out.println("Enter the contact name you wish to delete: ");
    String deleteName = deleteScanner.next();
    int i = 0;
    for (Contact person: this.contactList){
      if (deleteName.equalsIgnoreCase(person.getName())){
        break;
      } else if (!deleteName.equalsIgnoreCase(person.getName())){
        System.out.printf("Sorry, %s could not be located.", deleteName);
      }
      i++;
    }
    try {
      contactList.remove(i);
      System.out.println("Contact removed");
    } catch (NullPointerException e){
      e.printStackTrace();
    }
  }
}
