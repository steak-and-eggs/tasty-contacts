package app;

import java.util.ArrayList;
import java.io.File;

public class ModExit extends Module {

  private ContactWriter writer;

  public ModExit(ArrayList<Contact> cl, File cf){
    super(cl, cf);
    this.writer = new ContactWriter();
  }

  public void run(){
    this.writer.writeInto(this.contactList, this.config);

    System.out.println("Goodbye!");
    System.exit(0);
  }

}
