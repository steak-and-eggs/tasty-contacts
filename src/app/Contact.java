package app;

public class Contact {

  private String name;
  private String number;

  public Contact(String nm, String num){

    if(num.length() != 10){
      throw new NumberFormatException();
    }

    this.name = nm;
    this.number = num;
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
