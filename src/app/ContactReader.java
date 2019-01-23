package app;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class ContactReader {

  public void readInto(File file, ArrayList<Contact> contacts){

    Path fpath = Paths.get(file.getAbsolutePath());
    try {
      List<String> temp = Files.readAllLines(fpath);
      String[] contactMembers = null;

      for(String str : temp){
        contactMembers = str.split(",");
        contacts.add(new Contact(contactMembers[0], contactMembers[1]));
      }
    } catch(IOException e){
      e.printStackTrace();
    }

  }

}
