package app;
import java.io.File;
import java.io.IOException;

public class Config {

  private String pwd;
  private String contactsPath;

  public Config() {
    String pwd = System.getProperty("user.dir"); // locates user directory
    System.out.println(pwd);
    String dataPath = pwd.replace("bin", "data"); //specifies contacts.txt location
    System.out.println(dataPath);
    File dataDir = new File (dataPath);
    if (!dataDir.exists() ) {
      dataDir.mkdir();
      contactsPath = new String (dataPath+"/contacts.txt");
      File contacts = new File (contactsPath);
      try {
        contacts.createNewFile();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }

}
