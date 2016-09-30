package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public abstract class Person {

    private String userName;
    private String email;
    private String firstName;
    private String lastName;


    //username
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    //email
/*TODO filter string for unwanted character */
    //firstname
    public void  setFirstName(String firstName) {

        this.firstName = firstName;
    }

    public String getFirstName() {

        return this.firstName;
    }
    //lastname

    public void  setLastName(String lastName) {

        this.lastName = lastName;
    }

    public String getLastName() {

        return this.lastName;
    }


    //mynameis

/*
    public String intruduceYourSelf(){

    return "hi i'm" + " " +firstName+ " " +lastName+".";
    }
    */
    public Person(){

    }
    public Person (String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;

    }

}
