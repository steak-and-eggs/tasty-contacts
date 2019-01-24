package app;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class ModSearch extends Module {
  private Scanner searchScanner;
  public ModSearch(ArrayList<Contact> cl, File cf){
    super(cl, cf);
    searchScanner = new Scanner(System.in).useDelimiter("\n");
  }

  public void run(){
    System.out.println("Enter a contact name: ");
    String searchName = searchScanner.next().trim().toLowerCase();
    int i = 0;
    for (Contact person: this.contactList){
      if (searchName.equalsIgnoreCase(person.getName())){
        System.out.println(person);
        break;
      } else if (searchName.equalsIgnoreCase(person.getName())){
        System.out.printf("Sorry, %s could not be located.", searchName);
        }
      i++;
    }
  }
}
