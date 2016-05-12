public class Person {
  public String first;
  public String last;

  public Person(String first, String last) {
    this.first = first;
    this.last = last;
  }

  public String fullName() {
    return first + " " + last;
  }

  public static void main(String [] args) {
    Person rambo = new Person("Sylvester", "Stallone");
    rambo.fullName();
  }

}