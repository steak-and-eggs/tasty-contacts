package app;

public class Contact {

  private String name;
  private int number;

  public Contact(String nm, String num){
    try {
      this.name = nm;
      this.number = Integer.parseInt(this.sanitizeNumber(num));
    } catch(NumberFormatException e){
      System.out.println(num);
      System.out.println(this.sanitizeNumber(num));
      e.printStackTrace();
    }
  }

  private String sanitizeNumber(String number){
    String clean = "";
    for(char ch : number.toCharArray()){
      if(ch >= '0' && ch <= '9'){
        clean += ch;
      }
    }
    return clean;
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
