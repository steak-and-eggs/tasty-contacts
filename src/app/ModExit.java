package app;

import java.util.ArrayList;
import java.io.File;

public class ModExit extends Module {

  public ModExit(ArrayList<Contact> cl, File cf){
    super(cl, cf);
  }

  public void run(){
    System.out.println("Goodbye!");
    System.exit(0);
  }

}
