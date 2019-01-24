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


  }

}
