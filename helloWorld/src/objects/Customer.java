package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Customer extends Person {

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(int telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private String address;
    private int telephoneNumber;
    private int customerId;

    public String intruduceYourSelf(){

        return "Hi im " + " " +getFirstName()+ " " +getLastName()+" i work at CITE  .";
    }
    //overloading
    public String food(String fruits) {

        return "I want to buy Some "+fruits;

    }


}

    //TODO public name introduceYourself - body "hi im +Firstname+"

