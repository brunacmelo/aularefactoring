import java.util.Enumeration;

public abstract class Statement {
  
  public abstract String value1(Customer aCustomer);

  public abstract String value2(Rental each);

  public abstract String value3(Customer aCustomer);
  
  public String value(Customer aCustomer) {

    Enumeration rentals = aCustomer.getRentals();
    String result = this.value1(aCustomer);
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      result += this.value2(each);
    }
      //add footer lines
    result += this.value3(aCustomer);

    return result;
  }

}