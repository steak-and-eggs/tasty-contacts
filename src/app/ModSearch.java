package app;

import java.util.List;
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
    String query = searchScanner.next().toLowerCase();
    List<Contact> results = new ArrayList<Contact>();

    String current = null;
    for(Contact person: this.contactList){
      current = person.getName().toLowerCase();

      if(current.contains(query)){
        results.add(person);
      }
    }

    if(results.size() == 0){
      System.out.format("Sorry, no person with the name: %s exists.\n", query);
    }
    else{
      for(Contact person: results){
        System.out.println(person.toString());
      }
    }
  }
}
