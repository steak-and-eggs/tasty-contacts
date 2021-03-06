package app;

import java.util.ArrayList;
import java.io.File;

public abstract class Module implements Runnable {

  protected ArrayList<Contact> contactList;
  protected File config;

  public Module(ArrayList<Contact> cl, File cf){
    this.contactList = cl;
    this.config = cf;
  }

  public abstract void run();

}
