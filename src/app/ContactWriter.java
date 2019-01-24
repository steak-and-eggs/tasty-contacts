package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class ContactWriter {

  public void writeInto(ArrayList<Contact> contacts, File file){

    Path fpath = Paths.get(file.getAbsolutePath());
    String strContacts[] = new String[contacts.size()];

    {
      int i = 0;
      for(Contact contact : contacts){
        strContacts[i] = contact.toString();
        i++;
      }
    }

    try {
      Files.write(
        fpath,
        Arrays.asList(strContacts),
        StandardOpenOption.WRITE
      );
    } catch (IOException e){
      e.printStackTrace();
    }

  }

}
