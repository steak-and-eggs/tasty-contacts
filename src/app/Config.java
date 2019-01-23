package app;
import java.io.File;
import java.io.IOException;

public class Config {

  private String pwd;
  //private String contactsPath;
  private File contacts;

  public Config() {
    // locates user directory
    String pwd = System.getProperty("user.dir");

    // create the path to the data directory
    String dataPath = pwd.replace("bin", "data");
    File dataDir = new File(dataPath);

    if(!dataDir.exists()) {
      // make the data directory, then the contacts file
      dataDir.mkdir();
      String contactsPath = new String(dataPath + "/contacts.txt");
      this.contacts = new File(contactsPath);

      // this will never throw an error so we can do a generic stack trace to
      // satisfy the compiler
      try {
        this.contacts.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    else {
      this.contacts = new File(dataPath + "/contacts.txt");
    }
  }

  public File getContacts(){
    return this.contacts;
  }
}
