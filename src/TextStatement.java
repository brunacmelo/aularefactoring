import java.util.Enumeration;


public class TextStatement extends Statement {


  public String value1(Customer aCustomer) {
    return  "Rental Record for " + aCustomer.getName() + "\n";
  }

  public String value2(Rental each){
    return "\t" + each.getMovie().getTitle()+ "\t" +
      String.valueOf(each.getCharge()) + "\n";
  }

  public String value3(Customer aCustomer) {
    String result = "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n";
    result += "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) + " frequent renter points";
    return result;
  }
}