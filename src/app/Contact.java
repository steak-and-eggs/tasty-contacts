package app;

public class Contact {

  private String name;
  private int number;

  public Contact(String nm, String num)
    throws NumberFormatException
  {
    this.name = nm;
    this.number = Integer.parseInt(num);
  }

  public String toString(){
    return this.name + "," + this.number + ",";
  }

  public String getName(){
    return this.name;
  }

  public String getNumber (){
    return "" + this.number;
  }

}
