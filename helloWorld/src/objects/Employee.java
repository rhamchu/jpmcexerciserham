package objects;

/**
 * Created by jpmc on 9/28/2016.
 */
public class Employee extends Person {

    public String nameEmployee;
    public float payGrade;
    public int employerId;

    public void setNameEmployee(String nameEmployee) {

        this.nameEmployee = nameEmployee;
    }

    public String getNameEmployee() {

        return this.nameEmployee;


    }

    public String intruduceYourSelf(){

        return "Hi im " + " " +getFirstName()+ " " +getLastName()+" i work at CITE  .";
    }
}

